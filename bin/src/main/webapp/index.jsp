<html>
<body>
<h2>Hello World!</h2>

<form action="uptext.action" method="post" enctype="multipart/form-data">
    <input name="imag" type="file"  onchange="ab()">
    <input id="a" name="imag_name" type="text"  style="display: none">
    <input type="submit" >
</form>
</body>
<script>
     function  ab() {
        var date=new Date()
         var a=['0a','1c','2r','3s','4h','5b','6o','7p','8b','9w']
         a.reverse()
         var times=Math.random()
         var uid=""
         uid+=a[date.getDate()%10]+a[date.getHours()%10]+a[date.getSeconds()%10]+Math.abs(times)
        document.getElementById("a").value=uid
        alert(document.getElementById("a").value)
    }
</script>
</html>
