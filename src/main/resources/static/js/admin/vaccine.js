function deleteWareHouse(id) {
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
                url: '/admin/delete-vaccine/' + id,
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

function editWareHouse() {
    let id = $('#kId').val();
    let name = $('#kName').val();
    let amount = $('#kAmount').val();
    let vaccine = {
        vaccine_name: name,
        vaccine_amount: amount,
    }

    if (id == 0) {
        $.ajax({
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            type: "POST",
            data: JSON.stringify(vaccine),
            url: "/admin/create-V",
            success: function (houses) {

                $('#wareHouseList tbody').append(' <tr id="row' + houses.id + '">\n' +
                    '      <td>' + houses.id + '</td>\n' +
                    '      <td>' + houses.vaccine_name + '</td>\n' +

                    '      <td>' + houses.vaccine_amount + '</td>\n' +
                    '      <td><button onclick="loadEditData(' + houses.id + ')" type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal" data-whatever="@mdo">Edit</button>' +
                    '<input type="hidden" id="id" value="' + houses.id + '"></td>\n' +
                    ' <td><button onclick="deleteWareHouse(' + houses.id + ')" class="btn btn-outline-danger" ><i class="fas fa-trash-alt"></i>Delete</button>    </td>' +
                    ' </tr>');
                //sư kiện nào thực hiện Ajax
                $('.close-modal').click();
                Swal.fire({
                    icon: 'success',
                    title: 'Thêm mới vaccine thành công!',
                    showConfirmButton: false,
                    timer: 1500
                })
            }
        });
    } else {
        $.ajax({
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            type: "PUT",
            data: JSON.stringify(vaccine),
            url: '/admin/editV/' + id,
            success: function (house) {
                console.log(house);
                $('#row' + id + ' td').remove();
                $('#row' + id).html(`
                        <td>${house.id}</td>
                        <td>${house.vaccine_name}</td>
                       <td>${house.vaccine_amount}</td>
                       <td><button onclick="loadEditData(${house.id})" type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal" data-whatever="@mdo">Edit</button>
                       <input type="hidden" id="id" value="' + customer.id + '"></td>
                      <td><button onclick="deleteWareHouse(${house.id})" class="btn btn-outline-danger" ><i class="fas fa-trash-alt"></i>Delete</button></td>`);
                $('.close-modal').click();
                Swal.fire({
                    icon: 'success',
                    title: 'Chỉnh sửa vaccine thành công!',
                    showConfirmButton: false,
                    timer: 1500
                })
            }
        });
    }
}

function loadEditData(id) {
    $.ajax({
        type: 'GET',
        url: '/admin/apiIdV/' + id,
        success: function (house) {

            $('#exampleModalLabelSpan').text("Chỉnh sửa Vaccine");
            $('#kId').val(house.id);
            $('#kName').val(house.vaccine_name);
            $('#button_submit').text("Chỉnh sửa");
            $('#kAmount').val(house.vaccine_amount);
        }
    })
}

function loadAddnew() {
    $('#exampleModalLabelSpan').text("Thêm mới loại vaccine");
    $('#button_submit').text("Tạo mới");
    $('#kId').val(0);
    $('#kName').val("");
    $('#kAddress').val("");
    $('#kAmount').val("");
}

