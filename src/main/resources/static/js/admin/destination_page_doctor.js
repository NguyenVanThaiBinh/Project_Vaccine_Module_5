//chang status
    // Bind click event on all the buttons inside .card
    function click() {
        // Check if the clicked button has class `btn_s`
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

function setInjectionStatus() {
    let notIsInjectionList = [];
    let IsInjectionListDone = [];

    let table = document.getElementById("orderItems");
    let cells = (table.rows[2].cells.length - 1);
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
//
// $("ul li button").click(function (){
//     $("li button").removeClass("active");
//     $(this).addClass("active");
// })
//voi vao active so 1
$( document ).ready(function() {
    $("#0_button").addClass("active");
});


function changePage(value) {
    value = parseInt(value);
    console.log(value)
    //value 0 1
    let maxPage = $('#maxPage').val();
    let pageNumber = [];

    if (value > 0) {
        $("#prev").removeClass("disable_css");
        $("#prev").val(value - 1);
        $(`#${value}_button`).addClass("active");
        $(`#${value + 1}_button`).removeClass("active");
    } else {
        $("#prev").addClass("disable_css");
        $("#prev").val("");
    }
    if (value < maxPage - 1) {
        $("#next").removeClass("disable_css");
        $("#next").val(value + 1);
    } else {
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
                '        </tr>'
            for (let i = 0; i < ListCustomer.content.length; i++) {
                html += get(ListCustomer.content[i]);
            }
            $('#orderItems').html(html);
        }
    });
}
function get(customer){
    return `
        <tr>
                <th>${customer.id}</th>
                <td>${customer.customer_name}</td>
                <td>${customer.cmnd}</td>
                <td>${customer.email}</td>
                <td>${customer.time_vaccine}</td>
                <td>${customer.date_vaccine}</td>
                <td><button class="${customer.isInjection==0?"row_button btn btn-danger":"row_button btn btn-success"}">${customer.isInjection==0?"Chưa Tiêm":"Đã Tiêm"}</button></td>
            </tr>
        `
}

function main(){
    $('body').on('click','.row_button',click);
}
$("ul li button").click(function (){
    $("li button").removeClass("active");
    $(this).addClass("active");
})
main();
