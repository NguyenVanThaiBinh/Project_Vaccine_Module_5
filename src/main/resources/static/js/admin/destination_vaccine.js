
// setday
$( function() {
    let dateToday = new Date();
    dateToday.setDate(dateToday.getDate());
    let dates = $("#date-start,#date-end").datepicker({
        defaultDate: "+0w",
        // changeMonth: true,
        numberOfMonths: 1,
        minDate: dateToday,
        onSelect: function(selectedDate) {
            let option = this.id == "date-start" ? "minDate" : "maxDate",
                instance = $(this).data("datepicker"),
                date = $.datepicker.parseDate(instance.settings.dateFormat || $.datepicker._defaults.dateFormat, selectedDate, instance.settings);
            dates.not(this).datepicker("option", option, date);
        }
    });
} );
//Create
function create(){
    let name = $('#nameDestination').val();
    let arr1 = $('#date-start').val().split("/");
    let arr2 = $('#date-end').val().split("/");
    let date_end = arr2[1]+"-"+arr2[0]+"-"+arr2[2]+" ";
    let date_start = arr1[1]+"-"+arr1[0]+"-"+arr1[2]+" ";
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
        success: successHandler,
    })
    Swal.fire({
        icon: 'success',
        title: 'Tạo mới thành công',
        showConfirmButton: false,
        timer: 1500
    })
}

function successHandler(){
    $.ajax({
        type:'GET',
        url:'/admin/destination/api-full-0',
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
            $("#editForm")[0].reset();
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
                <td style="float:left;">
                    <button class="btn btn-primary" data-toggle="modal" href="#myModal" onclick="setEdit(${destination.id})"><i class="fas fa-edit"></i></button>
                    ${destination.isOpen==0?`<button class="btn btn-warning" onclick="off(${destination.id})">Off</button>`:`<button class="btn btn-success" onclick="on(${destination.id})">ON</button>`}    
                    ${destination.isOpen==1?`<button  class="btn btn-danger" onclick="getDelete(${destination.id})"><i class="far fa-trash-alt"></i></button>`:''}          
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
function setCreate(){
    $('.modal-title').html("Tạo mới địa điểm");
    $('.create').html("Tạo mới");
    $('#idEC').val(0);
    $("#editForm")[0].reset();
}
function setEdit(id){
    $('.modal-title').html("Chỉnh sửa");
    $('.create').html("Chỉnh sửa");
    $('#idEC').val(1);
    $.ajax({
        type:'GET',
        url:`/admin/destination/apiId/${id}`,
        success:function (data){
            $('#nameDestination').val(data.destination_name);
            $('#date-start').val(data.date_start);
            $('#date-end').val(data.date_end);
            $('#people_perHour').val(data.people_perHour);
            $('#idModal').val(id);
            $('#wareHouseVaccine').val(data.warehouseVaccine.id);
            $('#dateend_before').val(data.date_end);
            $('#datestart_before').val(data.date_start);
        }
    })
}

function manager(){
    let id = $('#idEC').val();
    if(id==0){
        create();
    }
    else if(id ==1){
        edit();
    }
}

function edit(){
    // 2 biến để so sánh giá trị thay đổi
    let dateend_before = $('#dateend_before').val();
    let datestart_before = $('#datestart_before').val();
    //convert mm/dd/yyyy to yyyy/mm/dd
    let arrS_bf = datestart_before.trim().split("-");
    datestart_before = arrS_bf[2]+"-"+arrS_bf[1]+"-"+arrS_bf[0];
    let arrE_bf = dateend_before.trim().split("-");
    dateend_before=arrE_bf[2]+"-"+arrE_bf[1]+"-"+arrE_bf[0];


    let id = $('#idModal').val();
    let name = $('#nameDestination').val();

    let arr1 = $('#date-start').val().split("/");
    let arr2 = $('#date-end').val().split("/");

    let date_end = arr2[1]+"-"+arr2[0]+"-"+arr2[2]+" ";
    let date_start = arr1[1]+"-"+arr1[0]+"-"+arr1[2]+" ";

    let dateEnd_compare = arr2[2]+"-"+arr2[0]+"-"+arr2[1];
    let dateStart_compare = arr1[2]+"-"+arr1[0]+"-"+arr1[1];

    if(arr1.length==1){
        date_start = arr1[0];
    }
    if(arr2.length==1){
        date_end = arr2[0];
    }
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
        type: "PUT",
        data: JSON.stringify(destination),
        url: `/admin/destination/edit/${id}`,
        success: function (){
            let countMail=0;
            $.ajax({
                type:'GET',
                url:`/admin/destination/allCusByDes/${id}`,
                success:function (data){
                    for(let i=0;i<data.length;i++){
                        if(data[i].date_vaccine!=null){
                            let arr = data[i].date_vaccine.trim().split("-");
                            // console.log(arr);
                            let dateConvert = arr[2]+"-"+arr[1]+"-"+arr[0];
                            console.log(dateConvert);
                            if(dateConvert>dateEnd_compare && dateEnd_compare.split("-").length==3){
                                countMail++;
                            }
                            if(dateConvert<dateStart_compare && dateStart_compare.split("-").length==3){
                                countMail++;
                            }
                        }
                    }
                    let text;
                    if(countMail==0){
                        text = "Việc thay đổi thời gian có thể gây ảnh hưởng tới những người đăng ký"
                    }
                    else{
                        text = "Việc thay đổi thời gian có thể gây ảnh hưởng tới những người đăng ký, Có "+countMail+" Người đăng ký sẽ được gửi mail"
                    }
                    const swalWithBootstrapButtons = Swal.mixin({
                        customClass: {
                            confirmButton: 'btn btn-success',
                            cancelButton: 'btn btn-danger'
                        },
                        buttonsStyling: false
                    })
                    swalWithBootstrapButtons.fire({
                        title: 'Bạn có chắc?',
                        text: text,
                        icon: 'warning',
                        showCancelButton: true,
                        confirmButtonText: 'Vâng, Sửa nó!',
                        cancelButtonText: 'Không, hủy!',
                        reverseButtons: true
                    }).then((result) => {
                        if (result.isConfirmed) {
                            swalWithBootstrapButtons.fire(
                                'Edited!',
                                'Kho đã được chỉnh sửa.',
                                'success'
                            );
                            if(dateend_before>dateEnd_compare.trim() && dateEnd_compare.split("-").length==3){
                                $.ajax({
                                    type:'GET',
                                    url:`/admin/destination/sendEmailEnd/${id}/${date_end.trim()}`,
                                })
                            }
                            if(datestart_before<dateStart_compare.trim() && dateStart_compare.split("-").length==3){
                                $.ajax({
                                    type:'GET',
                                    url:`/admin/destination/sendEmailStart/${id}/${date_start.trim()}`,
                                })
                            }
                            successHandler();
                        }
                        else if (
                            /* Read more about handling dismissals below */
                            result.dismiss === Swal.DismissReason.cancel
                        )
                        {
                            swalWithBootstrapButtons.fire(
                                'Cancelled',
                                'Your imaginary file is safe :)',
                                'error'
                            );
                        }
                    })
                }
            })
        }
    })
}
function off(id){
    let count =0;
    $.ajax({
        type:'GET',
        url:`/admin/destination/allCusByDes/${id}`,
        success:function (data){
            for(let i=0;i<data.length;i++){
                if(data[i].date_vaccine !=null && data[i].date_vaccine.trim().split(" ").length ==1 && data[i].isInjection==0){
                    count++;
                }
            }
            let text;
            if(count==0){
                text="Tắt điểm tiêm chủng này ?";
            }
            else{
                text = "Tắt điểm tiêm chủng này, có "+count+" người đăng ký bị ảnh hưởng, gửi mail thông báo hủy bỏ ? ";
            }
            Swal.fire({
                title: 'Bạn có chắc ?',
                showDenyButton: true,
                text: text,
                icon: 'warning',
                showCancelButton: true,
                confirmButtonColor: '#3085d6',
                cancelButtonColor: '#d33',
                confirmButtonText: 'Tắt!',
                denyButtonText: `Tắt + Gửi Mail `,
                cancelButtonText:'Hủy bỏ'
            }).then((result) => {
                if (result.isConfirmed) {
                    Swal.fire(
                        'Tắt điểm tiêm chủng!',
                        'Đã tắt điểm tiêm chủng',
                        'success'
                    )
                    $.ajax({
                        type: 'GET',
                        url: `/admin/destination/setOff/${id}`,
                        success: successHandler
                    })
                } else if (result.isDenied) {
                    $.ajax({
                        type:'GET',
                        url:`/admin/destination/sendEmailOff/${id}`,
                        success:function (){
                            $.ajax({
                                type: 'GET',
                                url: `/admin/destination/setOff/${id}`,
                                success:successHandler
                            })
                        }
                    })
                    Swal.fire({
                        icon: 'success',
                        title: 'Tắt điểm tiêm + gửi mail thành công',
                        showConfirmButton: false,
                        timer: 1500
                    })
                }
            })
        }
    })
}

function on(id){
    let text="Mở điểm tiêm chủng này ?";
    Swal.fire({
        title: 'Bạn có chắc ?',
        text: text,
        icon: 'warning',
        showCancelButton: true,
        confirmButtonColor: '#3085d6',
        cancelButtonColor: '#d33',
        confirmButtonText: 'Mở!',
        cancelButtonText:'Hủy bỏ'
    }).then((result) => {
        if (result.isConfirmed) {
            Swal.fire(
                'Mở điểm tiêm chủng!',
                'Đã mở điểm tiêm chủng',
                'success'
            )
            $.ajax({
                type: 'GET',
                url: `/admin/destination/setOn/${id}`,
                success: successHandler
            })
        }
    })
}


