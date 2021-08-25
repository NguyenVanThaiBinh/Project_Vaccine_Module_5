
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
function successHandler() {
    let search = $('#search').val();
    let page = $('#page').val();
    if(search==""){
        $.ajax({
            type: 'GET',
            url: '/admin/api-full?page='+page,
            success: function (data) {
                let content = '<tr class="tr">\n' +
                    '<td>Id</td>\n' +
                    '<td>Tên Khách hàng</td> \n' +
                    '<td>CMND</td> \n' +
                    '<td>Email</td>\n' +
                    '<td>Ngày tiêm chủng\t</td>\n' +
                    '<td>giờ tiêm chủng</td>\n' +
                    '</tr>';
                for (let i = 0; i < data.content.length; i++) {
                    content += getCustomer(data.content[i]);
                }
                document.getElementById("customerList").innerHTML = content;
                $('.close-modal').click();
            }
        })
    }
    else{
        $.ajax({
            type: 'GET',
            url: '/admin/api/'+search,
            success: function (data) {
                let content = '<tr class="tr">\n' +
                    '<td>Id</td>\n' +
                    '<td>Tên Khách hàng</td> \n' +
                    '<td>CMND</td> \n' +
                    '<td>Email</td>\n' +
                    '<td>Ngày tiêm chủng\t</td>\n' +
                    '<td>giờ tiêm chủng</td>\n' +
                    '</tr>';
                for (let i = 0; i < data.content.length; i++) {
                    content += getCustomer(data.content[i]);
                }
                document.getElementById("customerList").innerHTML = content;
                $('.close-modal').click();
            }
        })
    }
}
setInterval(function (){
    let search = $('#search').val();
    let page = $('#page').val();
    if(search==""){
        $.ajax({
            type: 'GET',
            url: '/admin/api-full?page='+page,
            success: function (data) {
                let content = '<thead><tr class="tr">\n' +
                    '<td>Id</td>\n' +
                    '<td>Tên </td> \n' +
                    '<td>CMND</td> \n' +
                    '<td>Email</td>\n' +
                    '<td>Ngày tiêm \t</td>\n' +
                    '<td>Giờ tiêm </td>\n' +
                    '</tr></thead><tbody>';
                for (let i = 0; i < data.content.length; i++) {
                    content += getCustomer(data.content[i]);
                }
                content+='</tbody>';
                document.getElementById("customerList").innerHTML = content;
            }
        })
        numberPage();
    }
    else{
        $.ajax({
            type: 'GET',
            url: '/admin/api/'+search,
            success: function (data) {
                let content = '<thead><tr>\n' +
                    '<td>Id</td>\n' +
                    '<td>Tên Khách hàng</td> \n' +
                    '<td>CMND</td> \n' +
                    '<td>Email</td>\n' +
                    '<td>Ngày tiêm chủng\t</td>\n' +
                    '<td>giờ tiêm chủng</td>\n' +
                    '</tr></thead><tbody>';
                for (let i = 0; i < data.content.length; i++) {
                    content += getCustomer(data.content[i]);
                }
                content+='</tbody>';
                document.getElementById("customerList").innerHTML = content;
            }
        })
    }
    setInfo();
},7000);
function numberPage(){
    $.ajax({
        type:'GET',
        url:'/admin/api-doctor',
        success:function (data){
            if(data.totalElements>=11){
                $('#nav').show();
            }
        }
    })
}
function setInfo(){
    let page = $('#page').val();
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
    if(employee.dateVaccine==null){
        employee.dateVaccine="";
    }
    if(employee.timeVaccine==null){
        employee.timeVaccine="";
    }
    return `<tr id='row${employee.id}'>
        <td>${employee.id}</td>
        <td>${employee.customer_name}</td>
        <td>${employee.cmnd}</td>
        <td>${employee.email}</td>
        <td>${employee.date_vaccine}</td>
        <td>${employee.time_vaccine}</td>
       <td>
       <button type="button" class="btn btn-primary edit"
                data-toggle="modal" data-target="#exampleModal"
                data-whatever="@mdo">Edit
        </button>
        <input type="hidden" id="idU" value="${employee.id}">
<!--        <button class="btn btn-outline-danger delete"><i-->
<!--                    class="fas fa-trash-alt"></i>Delete-->
<!--            </button>-->
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
        url='/admin/api-full';
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
                '<td>Email</td>\n' +
                '<td>Ngày tiêm chủng\t</td>\n' +
                '<td>giờ tiêm chủng</td>\n' +
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
            document.getElementById('customerList').innerHTML = content;
        }
    });
}
function test(){
    $('body').on('click','.edit',edit);
    $('body').on('input','#search',search);
}
test();
setInfo();