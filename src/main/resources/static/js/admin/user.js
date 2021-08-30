let count1 = 0 ;
let pageNumber = 0 ;
function edit(){
    let id = $(this).parent().find("#idU").val();
    $.ajax({
        type: 'GET',
        url: '/admin/apiID/' + id,
        success: function (customer) {
            $('#edName').val(customer.customer_name);
            $('#edEmail').val(customer.email);
            $('#edCMND').val(customer.cmnd);
            $('#edPhone').val(customer.phone_number);
            $('#edId').val(id);
        }
    })
}
function editUser() {
    let id = $('#edId').val();
    let name = $('#edName').val();
    let cmnd = $('#edCMND').val();
    let phone = $('#edPhone').val();
    let email = $('#edEmail').val();
    let User = {
        customer_name: name,
        email: email,
        cmnd: cmnd,
        phone_number: phone
    }
    $.ajax({
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        type: "PUT",
        data: JSON.stringify(User),
        url: '/admin/edit/' + id,
        success:successHandler,
    })
}
function successHandler(page) {
    let search = $('#search').val();
    let select = $('#select').val();
    let url;
    if(search==""){
        url = '/admin/api-full?page='+page;
    }
    else{
        url = '/admin/api/'+search;
    }
    $.ajax({
        type: 'GET',
        url: url,
        success: function (data) {
            let content = '<tr class="tr">\n' +
                '<td>Id</td>\n' +
                '<td>Tên</td> \n' +
                '<td>CMND</td> \n' +
                '<td>Điểm tiêm</td> \n'+
                '<td>Ngày giờ tiêm</td>\n' +
                '<td>Vaccine</td> \n'+
                '<td>Tình trạng</td> \n'+
                '</tr>';
            for (let i = 0; i < data.content.length; i++) {
                content += getCustomer(data.content[i]);
            }
            $('#customerList').html(content);
            $('.close-modal').click();
            let html = '<ul class="pagination pagination-info mb-0">';
            if(select==0){
                console.log("1");
                for(let i = 0 ;i <data.totalPages;i++){
                    html+=`<li class=${i==page?"page-item&#x20;active":"page-item"}><a class="page-link" onclick="select(${i})">${i+1}</a>\n</li>`
                }
            }
            else{
                console.log("2");
                for(let i = 0 ;i <data.totalPages;i++){
                    html+=`<li class=${i==0?"page-item&#x20;active":"page-item"}><a class="page-link" onclick="select(${i})">${i+1}</a>\n</li>`
                }
            }
            html+='</ul>'
            $('#nav').html(html);
        }
    });

}
setInterval(function (){
    $.ajax({
        type:'GET',
        url:'/admin/api-full',
        success:function (data){
            let count2 = data.totalElements;
            if(count2==count1){
                return;
            }
            else{
                let select = $('#select').val();
                if(select!=0){
                    return;
                }
                let search = $('#search').val();
                let url;
                if(search==""){
                    url = '/admin/api-full?page='+pageNumber;
                }
                else{
                    url = '/admin/api/'+search;
                }
                $.ajax({
                    type: 'GET',
                    url: url,
                    success: function (data) {
                        let content = '<thead><tr class="tr">\n' +
                            '<td>Id</td>\n' +
                            '<td>Tên </td> \n' +
                            '<td>CMND</td> \n' +
                            '<td>Điểm tiêm</td> \n'+
                            '<td>Ngày giờ tiêm</td>\n' +
                            '<td>Vaccine</td> \n'+
                            '<td>Tình trạng</td> \n'+
                            '</tr></thead><tbody>';
                        for (let i = 0; i < data.content.length; i++) {
                            content += getCustomer(data.content[i]);
                        }
                        content+='</tbody>';
                        $('#customerList').html(content);
                    }
                })
                numberPage();
                setInfo(0);
                count1 = count2;
            }
        }
    })
},7000);

function checkInterval(){
    $.ajax({
        type:'GET',
        url:'/admin/api-full',
        success:function (data){
            count1 = data.totalElements;
        }
    })
}

function numberPage(){
    $.ajax({
        type:'GET',
        url:'/admin/api-full',
        success:function (data){
            if(data.totalElements>=11){
                $('#nav').show();
            }
        }
    })
}
function setInfo(page){
    if(page==null){
        page = pageNumber;
    }
    $.ajax({
        type:'GET',
        url:'/admin/api-full?page='+page,
        success:function (data){
            let from = data.number * data.size +1;
            let to = from + data.content.length-1;
            let total = data.totalElements;
            // alert("Showing "+from+" to "+to+" of "+total+" users");
            $('#infoPage').html("Showing "+from+" to "+to+" of "+total+" users");
        }
    })
}
function getCustomer(employee) {
    if(employee.date_vaccine==null){
        employee.dateVaccine="";
    }
    if(employee.time_vaccine==null){
        employee.timeVaccine="";
    }
    return `<tr id='row${employee.id}'>
        <td>${employee.id}</td>
        <td>${employee.customer_name}</td>
        <td>${employee.cmnd}</td>
        <td>${employee.destination.destination_name}</td>
        <td>
            ${employee.date_vaccine} - ${employee.time_vaccine}
            ${employee.destination2!=null?`<br>${employee.date_vaccine2} - ${employee.time_vaccine2}`:''}
        </td>
        <td>${employee.vaccine.vaccine_name}</td>
        ${employee.isInjection2==3?`<td><i class="fas fa-check-double"></i></td>`:employee.isInjection==1?`<td><i class="fas fa-check"></i></td>`:'<td></td>'}
       <td>
       <button type="button" class="btn btn-success edit"
                data-toggle="modal" data-target="#exampleModal"
                data-whatever="@mdo">Edit
        </button>
        <input type="hidden" id="idU" value="${employee.id}">
        </td>
    </tr>
`;
}
function search(){
    let search = $('#search').val();
    $.ajax({
        type:'GET',
        url:'/admin/api/'+search,
        success:successHandler2(search)
    })
    event.preventDefault();
}
function successHandler2(searchCMND) {
    let url = "/admin/api/"+searchCMND;
    if(searchCMND==""){
        select(pageNumber);
        return;
    }
    $.ajax({
        type: "GET",
        //tên API
        url: url,
        //xử lý khi thành công
        success: function (data) {
            // hien thi danh sach o day
            let content = '<tr class="tr">\n' +
                '<td>Id</td>\n' +
                '<td>Tên Khách hàng</td> \n' +
                '<td>CMND</td> \n' +
                '<td>Điểm tiêm</td> \n'+
                '<td>Ngày giờ tiêm</td>\n' +
                '<td>Vaccine</td> \n'+
                '<td>Tình trạng</td> \n'+
                '</tr>';
            for (let i = 0; i < data.content.length; i++) {
                content += getCustomer(data.content[i]);
            }
            if(searchCMND==""){
                $('#nav').show();
            }
            else{
                $('#nav').hide();
            }
            $('#customerList').html(content);
        }
    });
}

//select destination
function select(page){
    if(page==null){
       page =0;
    }
    pageNumber  = page;
    let id = $('#select').val();
    if(id==0){
        successHandler(page);
        setInfo();
        return;
    }
    $.ajax({
        type:'GET',
        url:`/admin/all-api-des/${id}?page=${page}`,
        success: function (data) {
            let content = '<thead><tr class="tr">\n' +
                '<td>Id</td>\n' +
                '<td>Tên </td> \n' +
                '<td>CMND</td> \n' +
                '<td>Điểm tiêm</td> \n'+
                '<td>Ngày giờ tiêm</td>\n' +
                '<td>Vaccine</td> \n'+
                '<td>Tình trạng</td> \n'+
            '</tr></thead><tbody>';
            for (let i = 0; i < data.content.length; i++) {
                content += getCustomer(data.content[i]);
            }
            content+='</tbody>';
            $('#customerList').html(content);
            $('#nav').html(setPage(data.totalPages,page));
            setInfo(0);
        }
    })
}


function test(){
    $('body').on('click','.edit',edit);
    $('body').on('input','#search',search);
    checkInterval();
}
test();
setInfo();

function setPage(totalPage,pageActive){
    let html="";
    if(totalPage>1){
        html += '<ul class="pagination pagination-info mb-0">';
        for(let i = 0 ;i <totalPage;i++){
            html+=`<li class=${pageActive==i?"page-item&#x20;active":"page-item"}><a class="page-link" onclick ="select(${i})">${i+1}</a>\n</li>`
        }
        html+='</ul>'
    }

    return html;
}