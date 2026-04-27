# Program Penentuan Nilai Mahasiswa

# data mahasiswa
nama = "Fitri Yanti"
nim = "241011402276"

# input nilai dan kehadiran
nilai = float(input("Masukkan nilai: "))
kehadiran = float(input("Masukkan persentase kehadiran (%): "))

# proses
if kehadiran >= 75:
    
    if nilai >= 80:
        grade = "A"
    elif nilai >= 70:
        grade = "B"
    elif nilai >= 60:
        grade = "C"
    elif nilai >= 55:
        grade = "D"
    else:
        grade = "E"
    
    # output
    print("\n=== HASIL ===")
    print("Nama  :", nama)
    print("NIM   :", nim)
    print("Nilai :", nilai)
    print("Grade :", grade)

else:
    print("\n=== HASIL ===")
    print("Nama  :", nama)
    print("NIM   :", nim)
    print("Kehadiran kurang dari 75%")
    print("Status: Tidak Lulus")