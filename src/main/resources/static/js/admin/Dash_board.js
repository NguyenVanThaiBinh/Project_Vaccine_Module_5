function foo() {
    $.ajax({
        type: 'GET',
        url: '/admin/api-full',
        success: function (data) {

            let count = 0;
            for (let i = 0; i < data.content.length; i++) {
                if (data.content[i].isInjection == 1) {
                    count++;
                }
            }
            $('#amount1').html(count);
            $('#amount2').html(data.totalElements);
        }
    })

}

foo();
setInterval(foo, 7000);
//    <---------------------------- Chart -------------------------------------------->

let listDay = new Array();
let listRegisterNumber = new Array();
let listInjectionNumber = new Array();


// Get Data
$.ajax({
    type: "GET",
    headers: {
        'Accept': 'application/json',
        'Content-Type': 'application/json'
    },
    url: "admin/dashboard_api",

    success: function (chartDataList) {

        for (const listDayCustomerElement of chartDataList) {
            let str = listDayCustomerElement.dateVaccine.slice(0, 5);
            listDay.push(str);
            listRegisterNumber.push(listDayCustomerElement.registerNumber);
            listInjectionNumber.push(listDayCustomerElement.injectedNumber);

        }
        var ctx = document.getElementById('myChart').getContext('2d');

        var myChart = new Chart(ctx, {
            type: 'bar',
            data: {
                labels: listDay,
                datasets: [{
                    label: 'Lượt đăng ký',
                    data: listRegisterNumber,
                    borderColor: '#ffb1c1',
                    backgroundColor: '#ffb1c1',
                    borderWidth: 1
                },
                    {
                        label: 'Lượt đã tiêm',
                        data: listInjectionNumber,
                        backgroundColor: '#9ad0f5',
                        borderColor: '#9ad0f5',
                        borderWidth: 1
                    }]
            },
            options: {
                elements: {
                    line: {
                        tension: 0
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

let listDestination = new Array();
let listRegisterDestination = new Array();
let listInjectionDestination = new Array();
$.ajax({
    type: "GET",
    headers: {
        'Accept': 'application/json',
        'Content-Type': 'application/json'
    },
    url: "admin/dashboard_api_destination",

    success: function (chartDataList) {

        for (const listDayCustomerElement of chartDataList) {
            console.log(listDayCustomerElement)
            listDestination.push(listDayCustomerElement.destination);
            listRegisterDestination.push(listDayCustomerElement.registerNumber);
            listInjectionDestination.push(listDayCustomerElement.injectedNumber);

        }
        var ctx = document.getElementById('myChart2').getContext('2d');

        var myChart = new Chart(ctx, {
            type: 'bar',
            data: {
                labels: listDestination,
                datasets: [{
                    label: 'Lượt đăng ký',
                    data: listRegisterDestination,
                    borderColor: '#E6B0AA',
                    backgroundColor: '#E6B0AA',
                    borderWidth: 1
                },
                    {
                        label: 'Lượt đã tiêm',
                        data: listInjectionDestination,
                        backgroundColor: '#5D6D7E',
                        borderColor: '#5D6D7E',
                        borderWidth: 1
                    }]
            },
            options: {
                elements: {
                    line: {
                        tension: 0
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








