
//Create
function create(){
    let name = $('#nameDestination').val();
    let date_start = $('#date-start').val();
    let date_end = $('#date-end').val();
    let people_perHour =$('#people_perHour').val();
    let id_wareHouse = $('#wareHouseVaccine').val();
    let wareHour ={
        id : id_wareHouse
    }
    let destination = {
        destination_name : name,
        date_start : date_start,
        date_end : date_end,
        people_perHour:people_perHour,
        warehouseVaccine:wareHour
    }
    $.ajax({
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        type: "POST",
        data: JSON.stringify(destination),
        url: "/admin/destination/create",
        success: successHandler
    })
}

function successHandler(){
    $.ajax({
        type:'GET',
        url:'/admin/destination/api-full',
        success:function (data){
            let html='<tr>\n' +
                '                <th>ID</th>\n' +
                '                <th>Tên</th>\n' +
                '                <th>Bắt đầu</th>\n' +
                '                <th>Kết thúc</th>\n' +
                '                <th>Số mũi tiêm/ Giờ</th>\n' +
                '                <th>Tên kho vaccine</th>\n' +
                '                <th></th>\n' +
                '            </tr>'
            for(let i=0;i<data.content.length;i++){
                html += getDestination(data.content[i]);
            }
            $('#destinations').html(html);
            $('.close').click();
        }
    })
}

function getDestination(destination){
    return `
            <tr id="${destination.id+'-row'}">
                <td>${destination.id}</td>
                <td>${destination.destination_name}</td>
                <td>${destination.date_start}</td>
                <td>${destination.date_end}</td>
                <td>${destination.people_perHour}</td>
                <td>${destination.warehouseVaccine.warehouseName}</td>
                <td>
                    <button class="btn btn-primary">Edit</button>
                    <button class="btn btn-danger" disabled onclick="getDelete(${destination.id})">Delete</button>
                </td>
            </tr>
            `
}

//Delete
function getDelete(value) {
    Swal.fire({
        title: 'Bạn chắc chắn muốn xoá?',
        text: "Nội dung xoá sẽ mất vĩnh viễn",
        icon: 'question',
        showCancelButton: true,
        confirmButtonColor: '#3085d6',
        cancelButtonColor: '#d33',
        confirmButtonText: 'Vâng, tôi muốn xoá',
        cancelButtonText: 'Không, cám ơn'
    }).then(function (result) {
        if (result.isConfirmed) {
            $.ajax({
                type: "delete",
                url: "/admin/destination/" + value,
                data: {'id': value},
                success() {
                    swal.fire(
                        "Thành công!",
                        "Một địa điểm đã được xoá!",
                        "success"
                    )
                    $("#" + value + "-row").remove();
                },
                error() {
                    swal.fire(
                        "Cancelled",
                        "Lỗi đã xảy ra :(",
                        "error"
                    )
                }
            });
        }

    })
}
// function main(){
//     $('body').on('click','.create',create);
// }
// main();


