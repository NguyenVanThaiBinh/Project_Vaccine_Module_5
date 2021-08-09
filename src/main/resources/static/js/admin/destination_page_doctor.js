

//          <------------------------------------ Pageable------------------------------------->
//chang status

let currentPageNumber =0;
function click() {
    if ($(this).hasClass('btn-success')) {
        $(this).text('Chưa tiêm');
        $(this).removeClass('btn btn-success');
        $(this).toggleClass('btn btn-danger');
    } else {
        $(this).text('Đã tiêm');
        $(this).removeClass('btn btn-danger');
        $(this).toggleClass('btn btn-success');
    }
}

// API gọi thay đổi trạng thái
function setInjectionStatus() {
    let notIsInjectionList = [];
    let IsInjectionListDone = [];

    let table = document.getElementById("orderItems");
    let cells = (table.rows[2].cells.length - 1);
    // Quét hết cái bảng hiện tại
    for (let i = 1; i < table.rows.length; i++) {
        for (let j = 0; j <= cells; j++) {
            // console.log(table.rows[i].cells[j].innerHTML);
            if (table.rows[i].cells[j].innerHTML.includes("Chưa tiêm")) {
                // console.log(table.rows[i].cells[j].innerHTML);
                notIsInjectionList.push(table.rows[i].cells[2].innerHTML);
            }
            if (table.rows[i].cells[j].innerHTML.includes("Đã tiêm")) {
                console.log(table.rows[i].cells[j].innerHTML);
                IsInjectionListDone.push(table.rows[i].cells[2].innerHTML);
            }
        }
    }
    Swal.fire({
        title: 'Bạn đã kiểm tra kỹ càng?',
        text: "Những sai lầm sẽ rất khó khắc phục!",
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
                success: function (data) {

                }
            });
        }
    })
}

// Mới vào cái là lick để active trang số 1
$(document).ready(function () {
    $("#0_button").click();
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
    } else {
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
    return `
        <tr>
                <th>${customer.id}</th>
                <td>${customer.customer_name}</td>
                <td>${customer.cmnd}</td>
                <td>${customer.email}</td>
                <td>${customer.time_vaccine}</td>
                <td>${customer.date_vaccine}</td>
                <td><button class="${customer.isInjection == 0 ? "row_button btn btn-danger" : "row_button btn btn-success"}">${customer.isInjection == 0 ? "Chưa Tiêm" : "Đã Tiêm"}</button></td>
            </tr>
           
        `
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
            console.log(data);
            $('#orderItems ').empty();
            $.each(data.content, function (index, item) {
                $('#orderItems ').append(`
                     <tr>
                <th scope="row" >${item.id}</th>
                <td >${item.customer_name}</td>
                <td >${item.cmnd}</td>
                <td>${item.email}</td>
                <td >${item.time_vaccine}</td>
                <td >${item.date_vaccine}</td>
                <td ><button class="row_button btn ${item.isInjection == 0? 'btn-danger':'btn-success'}" >${item.isInjection == 0? 'Chưa tiêm':'Đã tiêm'}</button></td>
               
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
   console.log(value);
    $.ajax({
        type: 'POST',
        url: '/doctor/getCustomerByDay/' + value,
        contentType: "application/json; charset=utf-8",
        success: function (data) {
            console.log(data);
            var today = new Date();
            var dd = String(today.getDate()).padStart(2, '0');
            var mm = String(today.getMonth() + 1).padStart(2, '0'); //January is 0!
            var yyyy = today.getFullYear();

            today = dd + '-' + mm + '-' + yyyy+" ";
            console.log(today);

            let day = data.content[0].date_vaccine;
            console.log("Day is: "+day);

            $('#last_row ').show();

            if (day !=  today){
                console.log("AAA")
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
                <td >${item.time_vaccine}</td>
                <td >${item.date_vaccine}</td>
                   <td ><button class="row_button btn ${item.isInjection == 0? 'btn-danger':'btn-success'}" >${item.isInjection == 0? 'Chưa tiêm':'Đã tiêm'}</button></td>
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
