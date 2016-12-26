/**
 * Created by jfk on 2016/11/15.
 */

//  AJAX
$("#add").click(function () {
    var userName = $("#userName").val();
    var userAccount = $("#userAccount").val();
    var userPassWord = $("#userPassWord").val();
    var userAddress = $("#address").val();
    var userPhone = $("#phone").val();
    if(userName == "" || userAccount == "" || userPassWord == "" || userAddress == "" || userPhone == ""){
        return;
    }else{
        $.ajax({
            url:"http://Zero:8080/Tickets/Web/Application/registered.action",
            method:"POST",
            dataType:"jsonp",
            data:{
                userName:userName,
                userAccount:userAccount,
                userPassWord:userPassWord,
                userAddress:userAddress,
                userPhone:userPhone
            },
            success:function (data) {
                console.log(data);
                var ReturnVal = data;
                if(ReturnVal == false){
                    $(".errorText").show();
                }
            },
            error:function (err) {
                console.error(err);
            }
        });
    }
});
