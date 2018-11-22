<html>
    <head>
        <title>PHP e AJAX(JAVASCRIPT)</title>
        <meta charset="utf-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
        <script>
            function showHint(str) {
                if (str.length == 0) { 
                    document.getElementById("txtHint").innerHTML = "";
                    return;
                } else {
                    var xmlhttp = new XMLHttpRequest();
                    xmlhttp.onreadystatechange = function() {
                        if (this.readyState == 4 && this.status == 200) {
                            document.getElementById("txtHint").innerHTML = this.responseText;
                        }
                    };
                    xmlhttp.open("GET", "array.php?q=" + str, true);
                    xmlhttp.send();
                }
            }
        </script>
    </head>
    <body>
        <div class="container"><br>
            <p><b>Comece a digitar um nome no campo de entrada abaixo:</b></p>
            <form action="/action_page.php">
                <div class="form-group">
                  <label for="email">Digite um nome para buscar via AJAX:</label>
                  <input type="text" class="form-control" onkeyup="showHint(this.value)" value="dieis">
                </div>
            </form>
            <div class="alert alert-success">
              <strong>Sugestões:</strong> <span id="txtHint"></span>
            </div>
        </div>
    </body>
</html>