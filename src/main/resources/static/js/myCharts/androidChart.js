let androidChart = echarts.init(document.getElementById("div2"),'vintage');
let androidOption = {
    title: {
        text:'android',
        left:'50%',
        textStyle:{
            fontSize: 18
        },
        textAlign:'center'
    },
    legend:{},
    tooltip: {
        trigger: 'axis',
        formatter: function (params) {
            params = params[0];
            let date = new Date(params.name);
            let hour = date.getHours();
            let minutes = date.getMinutes();
            if(hour < 10){
                hour = '0' + hour;
            }
            if(minutes < 10){
                minutes = '0' + minutes;
            }
            let dateStr = hour + ':' + minutes;
            return dateStr + ' ' + params.value[1];
        },
        axisPointer: {
            animation: false
        }
    },
    xAxis: {
        type: 'time',
        splitLine: {
            show: false
        },
        splitNumber:8,
        max:function(value){
            let max = value.max;
            let maxTime = new Date(new Date(max).toLocaleDateString()).getTime()+24*60*60*1000-1;
            return maxTime;
        },
        min:function(value){
            let min = value.min;
            let minTime = new Date(new Date(min).toLocaleDateString()).getTime();
            return minTime;
        },
        axisLabel:{
            formatter:function(value,index){
                let date = new Date(value);
                let hour = date.getHours();
                let minutes = date.getMinutes();
                if(hour < 10){
                    hour = '0' + hour;
                }
                if(minutes < 10){
                    minutes = '0' + minutes;
                }
                return hour + ':' + minutes;
            },
        }
    },
    yAxis: {
        name:'',
        nameTextStyle:{
            fontSize:15
        },
        type: 'value',
        boundaryGap: [0, '100%'],
        splitLine: {
            show: false
        },
    },
    series: [{
        name: '',
        type: 'line',
        hoverAnimation: false,
        smooth: true,
        symbolSize: 4,
        data: []

    }]
};

androidChart.setOption(androidOption);