<?php
// file name: call_python.php
    $fullPath =
      'python sound_classification.py ./test.wav';
    exec($fullPath, $outpara);
    echo '<PRE>';
    var_dump($fullPath);
    var_dump($outpara);
    echo '<PRE>';
    
    $fp = @fopen("class.txt","w") or die("E");
    fputs($fp, $outpara[0]);
    fclose($fp);
?>