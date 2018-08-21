<!DOCTYPE html>
<html>
<head>
	<title>Array em php</title>
</head>
<body>
	
	<?php

		$x = array('agua' => '2','terra' => '3','fogo' => '4','ar' => '5');

		foreach ($x as $key => $X) {
			echo "<br>".$key." => ".$X;
		}

	?>

</body>
</html>