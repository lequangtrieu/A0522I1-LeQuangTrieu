-- 2.	Hiển thị thông tin của tất cả nhân viên có trong hệ thống có tên bắt đầu là một trong các ký tự “H”, “T” hoặc “K” và có tối đa 15 kí tự. 
select * 
from nhan_vien 
where ho_ten like 'h%' or ho_ten like 't%' or ho_ten like 'k%' and char_length(ho_ten) < 16; 

-- 3. Hiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi và có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”.
select * 
from khach_hang
where timestampdiff(year, ngay_sinh, now()) between 18 and 50
and dia_chi like '%Đà Nẵng%' or dia_chi like '%Quảng Trị%';

-- 4.	Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần. Kết quả hiển thị được sắp xếp tăng dần theo số lần đặt phòng của khách hàng. 
-- Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”.
select hd.ma_khach_hang, ho_ten , count(hd.ma_khach_hang) as so_lan_dat_phong

from hop_dong hd
join khach_hang kh
using (ma_khach_hang)
where ma_loai_khach = 1
group by hd.ma_khach_hang
order by so_lan_dat_phong;
