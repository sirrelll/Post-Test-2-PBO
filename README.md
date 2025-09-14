# Post-Test-2-PBO
Darel Prasetya Fawwaz | 2409116064 | Sistem Informasi B 24

Deskripsi Program

Program ini dibuat dengan menggunakan bahasa pemrograman Java di NetBeans yang memiliki 3 Packages dan masing masing memiliki fungsinya masing masing, dan disini juga menerapkan fitur searching atau cari event. Program ini dibuat untuk bisa mengelola informasi event atau konser, sehingga pengguna bisa menyusun daftar acara secara lebih teratur karena disetiap event memiliki nama dan tanggal pelaksanaan.


Penjelasan Program

Package Models

<img width="808" height="784" alt="Screenshot 2025-09-14 225127" src="https://github.com/user-attachments/assets/f4528c6c-bcd7-48be-a78e-ecde15549de6" />

Didalam package ini berisi class Event yang menjadi tempat untuk data data Event yang tersedia, didalamnya ada nama, tanggal, dan venue. dengan menggunakan access modifier private agar tidak bisa diakses langsung, dan data hanya bisa diubah melalui code yang ada di class Event, dan disini juga memakai tampikanInfo() untuk menampilkan detail event ke layar.


Package Service

<img width="766" height="879" alt="Screenshot 2025-09-14 225514" src="https://github.com/user-attachments/assets/c028c025-ec1f-4498-be71-ed2ee6878d42" />


<img width="807" height="881" alt="Screenshot 2025-09-14 225536" src="https://github.com/user-attachments/assets/0ae795aa-8270-49da-ba9f-3c5b337c532a" />

Didalam package ini terdapat class EventService yang dimana berfungsi sebagai pengelola CRUD, jadi data data yang ada di class ini disimpan didalam ArrayList, sehingga pengguna bisa menambahkan, mengupdate, menghapus, membaca data yang tersedia.



Package Main

<img width="692" height="639" alt="Screenshot 2025-09-14 225715" src="https://github.com/user-attachments/assets/78a28698-d86b-4c4d-85f3-8379400a08ac" />

Disini adalah package main nya yang berfungsi sebagai titik masuk program, dan program berjalan dengan perulangan agar menu selalu muncul sampai user memilih keluar.


Demonstrasi Program


<img width="405" height="206" alt="Screenshot 2025-09-14 230156" src="https://github.com/user-attachments/assets/dd30f930-2226-45c0-94e7-73489112eac1" />

Membuat sebuah event.

<img width="468" height="194" alt="Screenshot 2025-09-14 230208" src="https://github.com/user-attachments/assets/eb514790-3e36-466f-b966-ff3f3b9cb329" />

Melihat Event yang tersedia.

<img width="559" height="332" alt="Screenshot 2025-09-14 230312" src="https://github.com/user-attachments/assets/a2436d16-00e3-4480-aaed-53476961801c" />

Mengupdate atau mengubah event yang ada.

<img width="646" height="306" alt="Screenshot 2025-09-14 230429" src="https://github.com/user-attachments/assets/ac6bd468-afc5-4eda-80e5-18828e425159" />

Menghapus event yang ada.

<img width="540" height="260" alt="Screenshot 2025-09-14 230415" src="https://github.com/user-attachments/assets/780f8f6f-6c0c-49c9-9dcd-7d05b33c8222" />

Melakukan searching dengan kata kunci.




