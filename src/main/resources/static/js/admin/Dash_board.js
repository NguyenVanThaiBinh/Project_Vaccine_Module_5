function foo() {
    $.ajax({
        type: 'GET',
        url: '/admin/api-full',
        success: function (data) {
            let count = 0;
            for (let i = 0; i < data.content.length; i++) {
                if (data.content[i].checkStatus == 1) {
                    count++;
                }
            }
            $('#amount1').html(count);
            $('#amount2').html(data.totalElements);
        }
    })
    // $.ajax({
    //     type: 'GET',
    //     url: '/doctor/apiDateTime',
    //     success: function (data) {
    //         $('#amount3').html(data.people_per_hour * 4)
    //     }
    // })
}

foo();
setInterval(foo, 7000);
//    <---------------------------- Chart -------------------------------------------->

 let listDay = new Array();


    // Get Data
$.ajax({
    type: "GET",
    headers: {
        'Accept': 'application/json',
        'Content-Type': 'application/json'
    },
    url: "admin/db_api_dateList",

    success: function (ListDayCustomer) {
        for (const listDayCustomerElement of ListDayCustomer) {

            if(listDayCustomerElement != null){
                let str = listDayCustomerElement.slice(0,5);
                listDay.push(str);

            }
        }
        var ctx = document.getElementById('myChart').getContext('2d');

        var myChart = new Chart(ctx, {
            type: 'bar',
            data: {
                labels:listDay,
                datasets: [{
                    label: 'Lượt đăng ký',
                    data: [12, 15, 3, 5, 2, 3],
                    borderColor: '#ffb1c1',
                    backgroundColor: '#ffb1c1',
                    borderWidth: 1
                },
                    {
                        label: 'Lượt đã tiêm',
                        data: [1, 13, 3, 5, 9, 3],
                        backgroundColor: '#9ad0f5',
                        borderColor: '#9ad0f5',
                        borderWidth: 1
                    }]
            },
            options: {
                elements:{
                    line: {
                        tension:0
                    }
                },
                scales: {
                    y: {
                        beginAtZero: true
                    }
                }
            }
        });



    }
});







