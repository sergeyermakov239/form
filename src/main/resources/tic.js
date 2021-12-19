function submit(){
    const Form={};
    Form.name=document.getElementById('name').value;
    Form.email=document.getElementById('email').value;
    Form.phone=document.getElementById('phone').value;
    Form.questions=document.getElementById('questions').value;
    if (Form.name===''){
        window.alert('Поле "Имя" должно быть заполнено');
    } else if (Form.email===''){
        window.alert('Поле "Почта" должно быть заполнено');
    } else if (Form.phone===''){
        window.alert('Поле "Мобильный телефон" должно быть заполнено');
    } else if (Form.questions===''){
        window.alert('Поле "Вопросы" должно быть заполнено');
    } else {
        $.ajax({
            url: "http://localhost:8080/form/post",
            type: 'POST',
            contentType: "application/json;charset=utf-8",
            data: JSON.stringify(Form),
            success: function () {
                window.alert('SUCCESS');
            },
            error: function (e) {
                window.alert('ERROR');
            }
        });
        document.getElementById('name').value = '';
        document.getElementById('email').value = '';
        document.getElementById('phone').value = '';
        document.getElementById('questions').value = '';
    }
}

function usertable(){
    $.ajax({
        url:"http://localhost:8080/form/get",
        type:'GET',
        dataType: 'json',
        success:function (data){
            alert(data);
             let arr =data;
             for (let i=0; i<data.length;i++){
                 $("#table ").append("<tr>"+"<td>"+arr[i].name+"</td>"+"<td>"+arr[i].email+"</td>"+"<td>"+arr[i].phone+"</td>"+"<td>"+arr[i].questions+"</td>"+"</tr>")
             }



        }
    })
}