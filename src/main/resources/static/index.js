$(document).ready(function () {
    $('#add').click(function () {
        var serialName = $('#serialName').val();
        var creator = $('#creator').val();
        var mark = $('#mark').val();
        $.ajax({
            type:"POST",
            cache:false,
            url:"http://localhost:8080/add/",
            data: {serialName, creator,mark},
            success: alert('Data sended')
        })
    })
})
$(document).ready(function () {
    $('#delete').click(function () {
        var id = $('#serialName').val();

        $.ajax({
            type:"POST",
            cache:false,
            url:"http://localhost:8080/delete/",
            data: {id},
            success: alert('Data sended')
        })
    })
})


$(document).ready(function () {
    $('#search').click(function (){
        var name = $('#name').val();
        alert(name)
        $.getJSON(`http://localhost:8080/?name=${name}`, function (data) {
            console.log(data);
            var disp = $('#json');
            for (var i in data){

                var ul = document.createElement("ul");
                ul.className="list-group";
                ul.innerHTML = i + '';
                for (var j in data[i])
                {
                    var li = document.createElement("li");
                    li.innerHTML = j + ': '+data[i][j]
                    li.className="list-group-item";
                    ul.appendChild(li);
                }
                disp.append(ul);
            }
        });
    });
});

