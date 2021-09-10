

//          <------------------------------------ Pageable------------------------------------->
//chang status
let notIsInjectionList = [];
let IsInjectionListDone = [];
let currentPageNumber =0;
function click() {
    let id = $(this).parent().parent().find('#id').val();

    if ($(this).hasClass('btn-success')) {
        let count = 0 ;
        for(let i = 0 ; i<notIsInjectionList.length;i++){
            if(notIsInjectionList[i] == id){
                count++;
                break;
            }
        }
        if(count==0){
            notIsInjectionList.push(id);
        }
        for(let i = 0 ; i<IsInjectionListDone.length;i++){
            if(IsInjectionListDone[i] == id){
                IsInjectionListDone.splice(i,1);
            }
        }
        $(this).text('Chưa tiêm');
        $(this).removeClass('btn btn-success');
        $(this).toggleClass('btn btn-danger');
        $.ajax({
            type:'GET',
            url : `/doctor/undone/${id}`
        })
    }
    else {
        let count = 0 ;
        for(let i = 0 ; i<IsInjectionListDone.length;i++){
            if(IsInjectionListDone[i] == id){
                count++;
                break;
            }
        }
        if(count==0){
            IsInjectionListDone.push(id);
        }
        for(let i = 0 ; i<notIsInjectionList.length;i++){
            if(notIsInjectionList[i] == id){
                notIsInjectionList.splice(i,1);
            }
        }
        $(this).text('Đã tiêm');
        $(this).removeClass('btn btn-danger');
        $(this).toggleClass('btn btn-success');
        $.ajax({
            type:'GET',
            url : `/doctor/done/${id}`
        })
    }

}

// API gọi thay đổi trạng thái
function setInjectionStatus() {
    let total = IsInjectionListDone.length+notIsInjectionList.length;
    // Quét hết cái bảng hiện tại
    Swal.fire({
        title: 'Bạn đã kiểm tra kỹ càng?',
        text: "Đã tiêm : "+IsInjectionListDone.length+"/"+total,
        icon: 'question',
        showCancelButton: true,
        confirmButtonColor: '#3085d6',
        cancelButtonColor: '#d33',
        confirmButtonText: 'Vâng, tôi đã hiểu rõ',
        cancelButtonText: 'Chưa, để tôi xem lại'
    }).then((result) => {
        if (result.isConfirmed) {
            $.ajax({
                type: "POST",
                headers: {
                    'Accept': 'application/json',
                    'Content-Type': 'application/json'
                },
                url: "/doctor/setInjectToNone",
                data: JSON.stringify(notIsInjectionList),
                contentType: "application/json; charset=utf-8",
                dataType: 'text',
                success: function (data) {
                    Swal.fire({
                        icon: 'success',
                        title: 'Hệ thống đã được cập nhật!',
                        showConfirmButton: false,
                        timer: 1500
                    })
                }
            });
            $.ajax({
                type: "POST",
                headers: {
                    'Accept': 'application/json',
                    'Content-Type': 'application/json'
                },
                url: "/doctor/setInjectToDone",
                data: JSON.stringify(IsInjectionListDone),
                contentType: "application/json; charset=utf-8",
                dataType: 'text',
            });
        }
    })
}

// Mới vào cái là lick để active trang số 1
$(document).ready(function () {
    // $("#0_button").click();
    let id = $('#idDes').val();
    $.ajax({
        type:'GET',
        url : `/doctor/full-api/${id}`,
        success:function (data){
            for(let i =0;i<data.length;i++){
                if(data[i].date_vaccine2 ==null){
                    if(data[i].isInjection==0){
                        notIsInjectionList.push(data[i].id);
                    }
                    else{
                        IsInjectionListDone.push(data[i].id);
                    }
                }
                else{
                    if(data[i].isInjection2 ==3){
                        IsInjectionListDone.push(data[i].id);
                    }
                    else{
                        notIsInjectionList.push(data[i].id);
                    }
                }
            }
        }
    })
});


function changePage(value) {
    value = parseInt(value);
    currentPageNumber = value;


    //value 0 1
    let maxPage = $('#maxPage').val();
    let pageNumber = [];
    //Khi giảm dần số trang
    if (value > 0) {
        $("#prev").removeClass("disable_css");
        $(`#${value}_button`).addClass("active");
        $(`#${value + 1}_button`).removeClass("active");
        $("#prev").val(value - 1);

    } else {
        if (value == 0) {
            $(`#${value}_button`).addClass("active");
            $(`#${value + 1}_button`).removeClass("active");
        }
        $("#prev").addClass("disable_css");
        $("#prev").val("");
    }
    // Khi tăng dần số trăng
    if (value < maxPage - 1) {
        $("#next").removeClass("disable_css");
        $(`#${value}_button`).addClass("active");
        $(`#${value - 1}_button`).removeClass("active");
        $("#next").val(value + 1);
    }
    else {
        if (value == (maxPage - 1)) {
            $(`#${value}_button`).addClass("active");
            $(`#${value - 1}_button`).removeClass("active");
        }
        $("#next").addClass("disable_css");
        $("#next").val("");
    }
    pageNumber.push(value);
    $.ajax({
        type: "POST",
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        url: "/doctor/changePage",
        data: JSON.stringify(pageNumber),
        success: function (ListCustomer) {
            let html = '<tr>\n' +
                '            <th>#</th>\n' +
                '            <th>Tên</th>\n' +
                '            <th>Số CMND</th>\n' +
                '            <th>Email</th>\n' +
                '            <th>Giờ tiêm</th>\n' +
                '            <th>Ngày tiêm</th>\n' +
                '            <th>Trạng thái</th>\n' +
                '        </tr>\n'

            for (let i = 0; i < ListCustomer.content.length; i++) {
                html += get(ListCustomer.content[i]);
            }

            $('#orderItems').html(html);
        }
    });
}

function get(customer) {
    if(check(customer)==0){
        return `
        <tr>
                <th>${customer.id}</th>
                <td>${customer.customer_name}</td>
                <td>${customer.cmnd}</td>
                <td>${customer.email}</td>
                ${customer.time_vaccine2!=null?`<td>${customer.time_vaccine2}</td>`:`<td>${customer.time_vaccine}</td>`}
                ${customer.date_vaccine2!=null?`<td>${customer.date_vaccine2}</td>`:`<td>${customer.date_vaccine}</td>`}
                <td><button class="row_button btn btn-danger">Chưa Tiêm</button></td>
                <input type="hidden" value="${customer.id}" id="id">
            </tr>
        `
    }
    else{
        return `
        <tr>
                <th>${customer.id}</th>
                <td>${customer.customer_name}</td>
                <td>${customer.cmnd}</td>
                <td>${customer.email}</td>
                ${customer.time_vaccine2!=null?`<td>${customer.time_vaccine2}</td>`:`<td>${customer.time_vaccine}</td>`}
                ${customer.date_vaccine2!=null?`<td>${customer.date_vaccine2}</td>`:`<td>${customer.date_vaccine}</td>`}
                <td><button class="row_button btn btn-success">Đã Tiêm</button></td>
                <input type="hidden" value="${customer.id}" id="id">
            </tr>
        `
    }
}

function check(customer){
    for(let i = 0 ; i <notIsInjectionList.length;i++){
        if(customer.id==notIsInjectionList[i]){
            return 0;
        }
    }
    return 1;
}

//Hàm đổi trạng thái
function main() {
    $('body').on('click', '.row_button', click);
}

//Kick đâu active nấy
$("ul li button").click(function () {
    $("li button").removeClass("active");
    $(this).addClass("active");
})
main();

//          <------------------------------------ Search------------------------------------->
$('input[name="search"]').keyup(function () {
    let key_search = $(this).val();
    if(key_search == ""){
        key_search = "binhhu";
    }

    let currentPageList = [];
    currentPageList.push(currentPageNumber);
    // alert(currentPageList[0]);

    $.ajax({
        type: 'POST',
        url: '/doctor/search/' + key_search,
        data: JSON.stringify(currentPageList),
        contentType: "application/json; charset=utf-8",

        success: function (data) {
            $('#orderItems ').empty();
            $.each(data.content, function (index, item) {
                $('#orderItems ').append(`
                     <tr>
                <th scope="row" >${item.id}</th>
                <td >${item.customer_name}</td>
                <td >${item.cmnd}</td>
                <td>${item.email}</td>
                ${item.time_vaccine2!=null?`<td>${item.time_vaccine2}</td>`:`<td>${item.time_vaccine}</td>`}
                ${item.date_vaccine2!=null?`<td>${item.date_vaccine2}</td>`:`<td>${item.date_vaccine}</td>`}
                <td ><button class="row_button btn ${item.isInjection == 0? 'btn-danger':'btn-success'}" >${item.isInjection == 0? 'Chưa tiêm':'Đã tiêm'}</button></td>
               <input type="hidden" value="${item.id}" id="id">
            </tr>
                    `);
            });
            $('#orderItems').prepend('<tr>\n' +
                '            <th>#</th>\n' +
                '            <th>Tên</th>\n' +
                '            <th>Số CMND</th>\n' +
                '            <th>Email</th>\n' +
                '            <th>Giờ tiêm</th>\n' +
                '            <th>Ngày tiêm</th>\n' +
                '            <th>Trạng thái</th>\n' +
                '        </tr>\n');

        }
    })
});
                // Lấy theo danh sách ngày
function getCustomerByDay(value){
    if(value == -1)
        return;
    $.ajax({
        type: 'POST',
        url: '/doctor/getCustomerByDay/' + value,
        contentType: "application/json; charset=utf-8",
        success: function (data) {
            var today = new Date();
            var dd = String(today.getDate()).padStart(2, '0');
            var mm = String(today.getMonth() + 1).padStart(2, '0'); //January is 0!
            var yyyy = today.getFullYear();

            today = dd + '-' + mm + '-' + yyyy+" ";

            let day = data.content[0].date_vaccine;

            $('#last_row ').show();

            if (day !=  today){
                $('#last_row ').hide();
            }
            $('#orderItems ').empty();
            $.each(data.content, function (index, item) {
                $('#orderItems ').append(`
                     <tr>
                <th scope="row" >${item.id}</th>
                <td >${item.customer_name}</td>
                <td >${item.cmnd}</td>
                <td>${item.email}</td>
                ${item.time_vaccine2!=null?`<td>${item.time_vaccine2}</td>`:`<td>${item.time_vaccine}</td>`}
                ${item.date_vaccine2!=null?`<td>${item.date_vaccine2}</td>`:`<td>${item.date_vaccine}</td>`}
                   <td ><button class="row_button btn ${item.isInjection == 0? 'btn-danger':'btn-success'}" >${item.isInjection == 0? 'Chưa tiêm':'Đã tiêm'}</button></td>
                   <input type="hidden" value="${item.id}" id="id">
               </tr>
                    `);
            });
            $('#orderItems').prepend('<tr>\n' +
                '            <th>#</th>\n' +
                '            <th>Tên</th>\n' +
                '            <th>Số CMND</th>\n' +
                '            <th>Email</th>\n' +
                '            <th>Giờ tiêm</th>\n' +
                '            <th>Ngày tiêm</th>\n' +
                '            <th>Trạng thái</th>\n' +
                '        </tr>\n');

        }
    });

}
