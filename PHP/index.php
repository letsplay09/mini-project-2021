<!DOCTYPE html>
<html lang="en">

<?php
  //include 'connection.php';
?>

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Website #1 | SUSANTOKUN</title>
  <link rel="stylesheet" href="style.css">
</head>

<body>

  <header class="header">
    <h1>Home Page Website</h1>
    <p>Membuat Home Page PHP</p>
  </header>

  <nav class="navbar">
    <ul>
      <li class="utama"><a href="/web">Beranda</a></li>
      <li class="utama"><a href="index.php?web=form">Input Data</a></li>
      <li class="utama"><a href="index.php?web=view">Lihat Data</a></li>
      <li class="utama logout"><a href="#">Logout</a></li>
    </ul>
  </nav>

  <main class="main">

    <div class="content">
      <h2>TITLE 1</h2>
      <p>Lorem ipsum .</p>
      <br>
      <h2>TITLE 2</h2>
      <p>Lorem ipsum</p>
    </div>
    
    <aside class="sidebar">
      <h2>Tentang</h2>
      <p>Lorem ipsum </p>
      <br>
      <h2>Berita Terkini</h2>
      <p>Lorem ipsum </p>
    </aside>
  </main>

  <footer class="footer">
    <p>HacktoberFest 2020</p>
  </footer>

</body>

</html>