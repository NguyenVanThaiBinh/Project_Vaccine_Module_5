function deleteDestinationAccount(id) {
    let a = '#row' + id;
    Swal.fire({
        title: 'Bạn chắc chắn muốn xoá?',
        text: "Nội dung xoá sẽ mất vĩnh viễn",
        icon: 'question',
        showCancelButton: true,
        confirmButtonColor: '#3085d6',
        cancelButtonColor: '#d33',
        confirmButtonText: 'Vâng, tôi muốn xoá',
        cancelButtonText: 'Không, cám ơn'
    }).then((result) => {
        if (result.isConfirmed) {
            $.ajax({
                type: "DELETE",
                url: '/admin/delete_destination_account/' + id,
                //xử lý khi thành công
                success: function (data) {
                    $(a).remove();
                    swal.fire(
                        "Thành công!",
                        "Một vaccine đã được xoá!",
                        "success"
                    )
                }
            });
            //chặn sự kiện mặc định của thẻ
        } else if (
            /* Read more about handling dismissals below */
            result.dismiss === Swal.DismissReason.cancel
        ) {

        }
    })

}

function editDestinationAccount() {
    let id = $('#kId').val();
    let cmnd = $('#de_cmnd').val();
    let password = $('#de_password').val();
    let id_destination = $('#de_destination').val();
    let destination ={
        id : id_destination
    }
    let customer = {

        cmnd : cmnd,
        password : password,
        destination : destination
    }
    let customer_edit = {
        id : id,
        cmnd : cmnd,
        password : password,
        destination : destination
    }



    if (id == 0) {
        $.ajax({
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            type: "POST",
            data: JSON.stringify(customer),
            url: "/admin/createDestinationAccount",
            success: function (houses) {

                if (houses.id == null){
                    $('.close-modal').click();
                    $('#registration').trigger("reset");
                    Swal.fire({
                        icon: 'error',
                        title: 'Có lẽ CMND đã bị trùng :((',
                        showConfirmButton: false,
                        timer: 2500
                    })
                }else {
                    $('#customerList tbody').append(' <tr id="row' + houses.id + '">\n' +
                        '      <td>' + houses.id + '</td>\n' +
                        '      <td>' + houses.cmnd + '</td>\n' +

                        '      <td>' + houses.destination.destination_name + '</td>\n' +
                        '      <td><button onclick="loadEditData(' + houses.id + ')" type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal" data-whatever="@mdo">Edit</button>' +
                        '<input type="hidden" id="id" value="' + houses.id + '">\n' +
                        ' <button onclick="deleteDestinationAccount(' + houses.id + ')" class="btn btn-outline-danger" ><i class="fas fa-trash-alt"></i>Delete</button>    </td>' +
                        ' </tr>');
                    //sư kiện nào thực hiện Ajax
                    $('.close-modal').click();
                    Swal.fire({
                        icon: 'success',
                        title: 'Thêm tài khoản thành công!',
                        showConfirmButton: false,
                        timer: 1500
                    })
                }




            }
        });
    } else {

        $.ajax({

            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            type: "PUT",
            data: JSON.stringify(customer_edit),
            url: '/admin/edit_destination_account/' + id,
            success: function (house) {
                // console.log(house);
                if (house.cmnd == "-1"){
                    $('.close-modal').click();
                    $('#registration').trigger("reset");
                    Swal.fire({
                        icon: 'error',
                        title: 'Có lẽ CMND đã bị trùng :((',
                        showConfirmButton: false,
                        timer: 2500
                    })
                }else{
                    $('#row' + id + ' td').remove();
                    $('#row' + id).html(`
                        <td>${house.id}</td>
                        <td>${house.cmnd}</td>
                       <td>${house.destination.destination_name}</td>
                       <td><button onclick="loadEditData(${house.id})" type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal" data-whatever="@mdo">Edit</button>
                       <input type="hidden" id="id" value="' + customer.id + '">
                    <button onclick="deleteDestinationAccount(${house.id})" class="btn btn-outline-danger" ><i class="fas fa-trash-alt"></i>Delete</button></td>`);
                    $('.close-modal').click();
                    Swal.fire({
                        icon: 'success',
                        title: 'Chỉnh sửa tài khoản thành công!',
                        showConfirmButton: false,
                        timer: 1500
                    })
                }

            }
        });
    }
}

function loadEditData(id) {
    $.ajax({
        type: 'GET',
        url: '/admin/api_destination_account/' + id,
        success: function (house) {

            $('#exampleModalLabelSpan').text("Chỉnh sửa tài khoản");
            $('#kId').val(house.id);
            $('#de_cmnd').val(house.cmnd);
            $('#de_password').val("");
            $('#de_destination').val(house.destination.id);
            $('#button_submit').text("Chỉnh sửa");
        }
    })
}

function loadAddnew() {
    $('#exampleModalLabelSpan').text("Thêm mới tài khoản");
    $('#button_submit').text("Thêm mới");
    $('#kId').val(0);
    $('#kName').val("");
    $('#kAddress').val("");
    $('#kAmount').val("");
}

