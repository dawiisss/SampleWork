<?php
$user_name = "username";
$password = "password";
$database = "databasename";
$server = "serveraddress";

$db_handle = mysql_connect($server, $user_name, $password);
$db_found = mysql_select_db($database, $db_handle);

if ($db_found) {

$SQL = "update script here";

mysql_query($SQL);

print "Records have been updated";


mysql_close($db_handle);

}
else {

print "Database not found ";
mysql_close($db_handle);

}

?>