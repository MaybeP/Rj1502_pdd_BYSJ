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
        document.getElementById("a").value=date.toLocaleString()
        alert(document.getElementById("a").value)
    }
</script>
</html>
