<?php
$target_dir  = "./";
$target_path = $target_dir . basename( $_FILES['f1']['name']);
if(move_uploaded_file($_FILES['f1']['tmp_name'], $target_path)) {
 echo "The file ".  basename( $_FILES['class.wav']['name']).
 " has been uploaded";
} else{
 echo "ƒGƒ‰[‚ª”­¶‚µ‚Ü‚µ‚½B";
}
?>