/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package test.java.entity;

import entity.KhoaHoc;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Thinkpad E440
 */
public class KhoaHocTest {

	/**
	 * Test of getMaKhoaHoc method, of class KhoaHoc.
	 */
	@Test
	public void testGetMaKhoaHoc() {
		System.out.println("getMaKhoaHoc");
		KhoaHoc instance = new KhoaHoc();
		instance.setMaKhoaHoc("khoahoc1");
		String expResult = "khoahoc1";
		String result = instance.getMaKhoaHoc();
		assertEquals(expResult, result);

	}

	/**
	 * Test of setMaKhoaHoc method, of class KhoaHoc.
	 */
	@Test
	public void testSetMaKhoaHoc() {
		System.out.println("setMaKhoaHoc");
		String maKhoaHoc = "khoahoc1";
		KhoaHoc instance = new KhoaHoc();
		instance.setMaKhoaHoc(maKhoaHoc);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testSetMaKhoaHocAllNum() {
		System.out.println("setMaKhoaHoc");
		String maKhoaHoc = "khoahoc1";
		KhoaHoc instance = new KhoaHoc();
		instance.setMaKhoaHoc(maKhoaHoc);
	}

	/**
	 * Test of getMaChuyenDe method, of class KhoaHoc.
	 */
	@Test
	public void testGetMaChuyenDe() {
		System.out.println("getMaChuyenDe");
		KhoaHoc instance = new KhoaHoc();
		instance.setMaChuyenDe("ChuyenDe1");
		String expResult = "ChuyenDe1";
		String result = instance.getMaChuyenDe();
		assertEquals(expResult, result);
	}

	/**
	 * Test of setMaChuyenDe method, of class KhoaHoc.
	 */
	@Test
	public void testSetMaChuyenDe() {
		System.out.println("setMaChuyenDe");
		String maChuyenDe = "ChuyenDe1";
		KhoaHoc instance = new KhoaHoc();
		instance.setMaChuyenDe(maChuyenDe);

	}

	@Test(expected = IllegalArgumentException.class)
	public void testSetMaChuyenDeAllNum() {
		System.out.println("setMaChuyenDe");
		String maChuyenDe = "111111";
		KhoaHoc instance = new KhoaHoc();
		instance.setMaChuyenDe(maChuyenDe);

	}

	/**
	 * Test of getHocPhi method, of class KhoaHoc.
	 */
	@Test
	public void testGetHocPhi() {
		System.out.println("getHocPhi");
		KhoaHoc instance = new KhoaHoc();
		instance.setHocPhi(500);
		float expResult = 500F;
		float result = instance.getHocPhi();
		assertEquals(expResult, result, 0);

	}

	/**
	 * Test of setHocPhi method, of class KhoaHoc.
	 */
	@Test
	public void testSetHocPhi() {
		System.out.println("setHocPhi");
		float hocPhi = 500F;
		KhoaHoc instance = new KhoaHoc();
		instance.setHocPhi(hocPhi);

	}

	@Test(expected = IllegalArgumentException.class)
	public void testSetHocPhiNegative() {
		System.out.println("setHocPhi");
		float hocPhi = -500F;
		KhoaHoc instance = new KhoaHoc();
		instance.setHocPhi(hocPhi);

	}

	/**
	 * Test of getThoiLuong method, of class KhoaHoc.
	 */
	@Test
	public void testGetThoiLuong() {
		System.out.println("getThoiLuong");
		KhoaHoc instance = new KhoaHoc();
		instance.setThoiLuong(300);
		int expResult = 300;
		int result = instance.getThoiLuong();
		assertEquals(expResult, result);
	}

	/**
	 * Test of setThoiLuong method, of class KhoaHoc.
	 */
	@Test
	public void testSetThoiLuong() {
		System.out.println("setThoiLuong");
		int thoiLuong = 0;
		KhoaHoc instance = new KhoaHoc();
		instance.setThoiLuong(thoiLuong);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testSetThoiLuongNegative() {
		System.out.println("setThoiLuong");
		int thoiLuong = -10;
		KhoaHoc instance = new KhoaHoc();
		instance.setThoiLuong(thoiLuong);

	}

	/**
	 * Test of getNgayKhaiGiang method, of class KhoaHoc.
	 */
	@Test
	public void testGetNgayKhaiGiang() {

		try {
			System.out.println("getNgayKhaiGiang");
			SimpleDateFormat sdf = new SimpleDateFormat();
			sdf.applyPattern("dd/MM/YYYY");
			KhoaHoc instance = new KhoaHoc();
			instance.setNgayKhaiGiang(sdf.parse("02/02/2002"));
			Date expResult = sdf.parse("02/02/2002");
			Date result = instance.getNgayKhaiGiang();
			assertEquals(expResult, result);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); 
		}

	}

	/**
	 * Test of setNgayKhaiGiang method, of class KhoaHoc.
	 */
	@Test
	public void testSetNgayKhaiGiang() {
		try {
			System.out.println("setNgayKhaiGiang");
			SimpleDateFormat sdf = new SimpleDateFormat();
			sdf.applyPattern("dd/MM/YYYY");
			KhoaHoc instance = new KhoaHoc();
			instance.setNgayKhaiGiang(sdf.parse("02/02/2002"));
			Date expResult = sdf.parse("02/02/2002");
			Date result = instance.getNgayKhaiGiang();
			assertEquals(expResult, result);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test(expected = NullPointerException.class)
	public void testSetNgayKhaiGiangNull() {
		
			System.out.println("setNgayKhaiGiang");
			SimpleDateFormat sdf = new SimpleDateFormat();
			sdf.applyPattern("dd/MM/YYYY");
			KhoaHoc instance = new KhoaHoc();
			instance.setNgayKhaiGiang(null);
			
		
	}

	/**
	 * Test of getGhiChu method, of class KhoaHoc.
	 */
	@Test
	public void testGetGhiChu() {
		System.out.println("getGhiChu");
		KhoaHoc instance = new KhoaHoc();
		instance.setGhiChu("ghichu");
		String expResult = "ghichu";
		String result = instance.getGhiChu();
		assertEquals(expResult, result);

	}

	/**
	 * Test of setGhiChu method, of class KhoaHoc.
	 */
	@Test(expected = NullPointerException.class)
	public void testSetGhiChuNull() {
		System.out.println("setGhiChu");
		String ghiChu = null;
		KhoaHoc instance = new KhoaHoc();
		instance.setGhiChu(ghiChu);

	}
	@Test
	public void testSetGhiChuRong() {
		System.out.println("setGhiChu");
		String ghiChu = "";
		KhoaHoc instance = new KhoaHoc();
		instance.setGhiChu(ghiChu);
		String expected = "";
		assertEquals(expected, instance.getGhiChu());
		
	}

	
	@Test
	public void testGetMaNhanVien() {
		System.out.println("getMaNhanVien");
		KhoaHoc instance = new KhoaHoc();
		instance.setMaNhanVien("nv01");
		String expResult = "nv01";
		String result = instance.getMaNhanVien();
		assertEquals(expResult, result);

	}
	
	

	/**
	 * Test of setMaNhanVien method, of class KhoaHoc.
	 */
	@Test(expected = NullPointerException.class)
	public void testSetMaNhanVienNull() {
		System.out.println("setMaNhanVien");
		String maNhanVien = null;
		KhoaHoc instance = new KhoaHoc();
		instance.setMaNhanVien(maNhanVien);

	}

	@Test
	public void testSetMaNhanVien() {
		System.out.println("setMaNhanVien");
		String maNhanVien = "nv01";
		KhoaHoc instance = new KhoaHoc();
		instance.setMaNhanVien(maNhanVien);

	}
	
	/**
	 * Test of getNgayTao method, of class KhoaHoc.
	 */
	@Test
	public void testGetNgayTao() {
		try {
			System.out.println("getNgayKhaiGiang");
			SimpleDateFormat sdf = new SimpleDateFormat();
			sdf.applyPattern("dd/MM/YYYY");
			KhoaHoc instance = new KhoaHoc();
			instance.setNgayTao(sdf.parse("02/02/2002"));
			Date expResult = sdf.parse("02/02/2002");
			Date result = instance.getNgayKhaiGiang();
			assertEquals(expResult, result);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	/**
	 * Test of setNgayTao method, of class KhoaHoc.
	 */
	@Test(expected = NullPointerException.class)
	public void testSetNgayTaoNull() {
		System.out.println("setNgayTao");
		Date ngayTao = null;
		KhoaHoc instance = new KhoaHoc();
		instance.setNgayTao(ngayTao);
	}

	/**
	 * Test of toString method, of class KhoaHoc.
	 */


}
