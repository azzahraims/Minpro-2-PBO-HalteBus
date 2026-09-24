# Sistem Manajemen Halte Bus ˚ ༘ 🚍⋆｡˚

<sub>Az-Zahra Imsawati Sugianto - 2509116062</sub>

---

## Deskripsi Singkat Program

Sistem Manajemen Halte Bus merupakan program berbasis Java yang digunakan oleh admin untuk mengelola data halte bus. Program menyediakan fitur CRUD (Create, Read, Update, Delete) yang terdiri dari menambah, melihat, mengubah, dan menghapus data halte.

Data halte disimpan menggunakan `ArrayList`. Pada program terdapat dua jenis halte, yaitu **Halte Reguler** dan **Halte Transit**.

---

## Alur Program

Saat program dijalankan, sistem akan menampilkan menu utama yang terdiri dari:

1. **Tambah Halte:** Admin dapat menambahkan data halte dengan memilih jenis Halte Reguler atau Halte Transit, kemudian mengisi data halte sesuai input yang tersedia. Data yang berhasil ditambahkan akan disimpan ke dalam `ArrayList`.

2. **Lihat Data Halte:** Admin dapat melihat seluruh data halte yang tersimpan di dalam `ArrayList`. Program juga telah memiliki dummy data awal sehingga data halte dapat langsung ditampilkan saat program pertama kali dijalankan.

3. **Ubah Data Halte:** Admin memasukkan ID halte yang ingin diubah. Sistem akan mencari halte berdasarkan ID tersebut. Jika halte ditemukan, admin dapat memasukkan data baru untuk memperbarui data halte.

4. **Hapus Halte:** Admin memasukkan ID halte yang ingin dihapus. Sistem akan mencari halte berdasarkan ID tersebut dan menghapus data apabila halte ditemukan.

5. **Keluar:** Admin dapat memilih menu keluar untuk mengakhiri program.

Setelah proses pada menu selesai dilakukan, program akan kembali menampilkan menu utama sampai admin memilih menu Keluar.

---

## Penerapan Encapsulation

Encapsulation diterapkan pada class `Halte`, `HalteReguler`, dan `HalteTransit`. Atribut pada setiap class menggunakan access modifier `private` sehingga atribut tidak dapat diakses secara langsung dari luar class.

Akses dan perubahan nilai atribut dilakukan melalui method getter dan setter.

Contoh penerapan pada class `Halte`:

<img width="184" height="85" alt="Screenshot 2026-09-24 050759" src="https://github.com/user-attachments/assets/0c884922-63c6-4a3a-98c9-24bd7902f5e3" />

Getter digunakan untuk mengambil nilai atribut, sedangkan setter digunakan untuk mengubah nilai atribut. Setter pada program juga dilengkapi dengan validasi terhadap nilai yang diberikan.

---

## Penerapan Inheritance

Inheritance diterapkan dengan menjadikan class `Halte` sebagai **superclass**, sedangkan `HalteReguler` dan `HalteTransit` sebagai **subclass**.

Struktur inheritance pada program:

Class `HalteReguler` dan `HalteTransit` menggunakan `extends Halte` sehingga dapat mewarisi atribut dan method dari superclass `Halte`.

<img width="252" height="33" alt="image" src="https://github.com/user-attachments/assets/a169215f-b597-4e1f-899f-ce73e7393cdc" />   
<br> 
<img width="278" height="33" alt="image" src="https://github.com/user-attachments/assets/833834c4-9714-412b-b19b-fb2654986dc4" />

`HalteReguler` memiliki atribut tambahan `titikTujuan`, sedangkan `HalteTransit` memiliki atribut tambahan `rutePenghubung`.

Constructor pada kedua subclass menggunakan `super()` untuk memanggil constructor dari superclass `Halte`.

---

## ⭐ Penerapan Nilai Tambah

Pada program ini diterapkan dua nilai tambah, yaitu MVC (Model-View-Controller) dan Polymorphism.

### MVC (Model-View-Controller)

Penerapan MVC dilakukan dengan memisahkan class ke dalam package berdasarkan fungsi.

<img width="199" height="164" alt="image" src="https://github.com/user-attachments/assets/f2892d7b-2d44-4508-8cb2-54b524e10d8c" />

- **Model** berisi class `Halte`, `HalteReguler`, dan `HalteTransit` yang digunakan untuk merepresentasikan data halte.
- **View** berisi class `Main` yang digunakan untuk menjalankan program dan berinteraksi dengan pengguna melalui menu.
- **Controller** berisi class `HalteController` yang digunakan untuk mengatur proses pengelolaan data halte.
- **Util** berisi class `InputValidator` yang digunakan untuk membantu proses validasi input pengguna.

Pemisahan tersebut membuat setiap bagian program memiliki fungsi dan tanggung jawab yang lebih terorganisir.

### Polymorphism

Polymorphism diterapkan menggunakan method overriding pada method `tampilkanInfo()`.

Method `tampilkanInfo()` terdapat pada superclass `Halte`, kemudian method tersebut di-override pada subclass `HalteReguler` dan `HalteTransit`.

Contoh penerapan overriding pada `HalteReguler`:

<img width="338" height="82" alt="image" src="https://github.com/user-attachments/assets/e0b272e1-1cdd-468c-9128-cfa86605c8c6" />

Pada `HalteTransit`, method `tampilkanInfo()` juga di override untuk menampilkan informasi khusus berupa rute penghubung.

Dengan method overriding, pemanggilan method `tampilkanInfo()` dapat menampilkan informasi yang berbeda sesuai dengan jenis objek halte.

---

## Dokumentasi Program

### Menu Utama

<img width="203" height="118" alt="image" src="https://github.com/user-attachments/assets/2a715f76-4425-4b19-bbd4-0e5c03515b0a" />

Menu Utama menampilkan lima pilihan yang dapat digunakan admin untuk mengelola data halte, yaitu tambah, lihat, ubah, hapus data halte, serta keluar dari program.

### Tambah Halte

Pada menu Tambah Halte, admin dapat memilih dua jenis halte, yaitu Halte Reguler dan Halte Transit. Halte Reguler memiliki data khusus berupa titik tujuan, sedangkan Halte Transit memiliki rute penghubung. Setelah seluruh data diisi, sistem akan menyimpan data halte ke dalam ArrayList.

Halte Reguler dipilih dengan memasukkan pilihan 1. Data yang diisi meliputi ID halte, nama halte, lokasi, kapasitas, rute bus, serta titik tujuan sebagai data khusus Halte Reguler.

<img width="194" height="171" alt="Screenshot 2026-09-24 053529" src="https://github.com/user-attachments/assets/64bd33f8-209b-4b81-a8ff-51a4fed35d0a" />

Halte Transit dipilih dengan memasukkan pilihan 2. Data yang diisi meliputi ID halte, nama halte, lokasi, kapasitas, rute bus, serta rute penghubung sebagai data khusus Halte Transit.

### Lihat Data Halte

<img width="176" height="244" alt="image" src="https://github.com/user-attachments/assets/eb145383-2ab6-4b43-9a6e-a75c3ec5bda1" />

Menu Lihat Data Halte menampilkan seluruh data halte yang tersimpan di dalam ArrayList. Informasi yang ditampilkan menyesuaikan jenis halte, termasuk titik tujuan pada Halte Reguler dan rute penghubung pada Halte Transit.

### Ubah Data Halte

<img width="228" height="264" alt="Screenshot 2026-09-24 054023" src="https://github.com/user-attachments/assets/4d801a94-cc4f-405a-ba0d-9c16793e6b9f" />

Menu Ubah Data Halte digunakan untuk memperbarui data berdasarkan ID halte. Setelah data ditemukan, admin dapat memasukkan data baru.

### Hapus Halte

<img width="168" height="44" alt="Screenshot 2026-09-24 054212" src="https://github.com/user-attachments/assets/b4ca8f04-89e6-461d-8355-8320b544ca2e" />

Menu Hapus Halte digunakan untuk menghapus data berdasarkan ID halte. 

### Keluar

<img width="333" height="44" alt="image" src="https://github.com/user-attachments/assets/eb50655a-dc9f-4708-b96b-1e00cea639b5" />

Menu Keluar digunakan untuk mengakhiri program. Setelah menu dipilih, sistem menampilkan pesan penutup dan program berhenti.
