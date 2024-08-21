/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package test.java.entity;

import entity.KhoaHoc;
import entity.NguoiHoc;

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
public class NguoiHocTest {

	/**
	 * Test of getNgayDuocThem method, of class NguoiHoc.
	 */
	@Test
	public void testGetNgayDuocThem() {

		try {
			System.out.println("getNgayKhaiGiang");
			SimpleDateFormat sdf = new SimpleDateFormat();
			sdf.applyPattern("dd/MM/YYYY");
			NguoiHoc instance = new NguoiHoc();
			instance.setNgayDuocThem(sdf.parse("02/02/2002"));
			Date expResult = sdf.parse("02/02/2002");
			Date result = instance.getNgayDuocThem();
			assertEquals(expResult, result);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * Test of setNgayDuocThem method, of class NguoiHoc.
	 */
	@Test
	public void testSetNgayDuocThem() {
		try {
			System.out.println("getNgayKhaiGiang");
			SimpleDateFormat sdf = new SimpleDateFormat();
			sdf.applyPattern("dd/MM/YYYY");
			NguoiHoc instance = new NguoiHoc();
			instance.setNgayDuocThem(sdf.parse("02/02/2002"));
			Date expResult = sdf.parse("02/02/2002");
			Date result = instance.getNgayDuocThem();
			assertEquals(expResult, result);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(expected = NullPointerException.class)
	public void testSetNgayDuocThemNull() {

		System.out.println("getNgayKhaiGiang");
		SimpleDateFormat sdf = new SimpleDateFormat();
		sdf.applyPattern("dd/MM/YYYY");
		NguoiHoc instance = new NguoiHoc();
		instance.setNgayDuocThem(null);

	}

	/**
	 * Test of getMaNhanVienDaThem method, of class NguoiHoc.
	 */
	@Test
	public void testGetMaNhanVienDaThem() {
		System.out.println("getMaNhanVienDaThem");
		NguoiHoc instance = new NguoiHoc();
		instance.setMaNhanVienDaThem("nv01");
		String expResult = "nv01";
		String result = instance.getMaNhanVienDaThem();
		assertEquals(expResult, result);

	}

	/**
	 * Test of setMaNhanVienDaThem method, of class NguoiHoc.
	 */
	@Test
	public void testSetMaNhanVienDaThem() {
		System.out.println("getMaNhanVienDaThem");
		NguoiHoc instance = new NguoiHoc();
		instance.setMaNhanVienDaThem("nv01");
		String expResult = "nv01";
		String result = instance.getMaNhanVienDaThem();
		assertEquals(expResult, result);

	}

	@Test(expected = NullPointerException.class)
	public void testSetMaNhanVienDaThemNull() {
		System.out.println("getMaNhanVienDaThem");
		NguoiHoc instance = new NguoiHoc();
		instance.setMaNhanVienDaThem(null);

	}

	/**
	 * Test of getMaNguoiHoc method, of class NguoiHoc.
	 */
	@Test
	public void testGetMaNguoiHoc() {
		System.out.println("getMaNguoiHoc");
		NguoiHoc instance = new NguoiHoc();
		instance.setMaNguoiHoc("NH01");
		String expResult = "NH01";
		String result = instance.getMaNguoiHoc();
		assertEquals(expResult, result);

	}

	/**
	 * Test of setMaNguoiHoc method, of class NguoiHoc.
	 */
	@Test
	public void testSetMaNguoiHoc() {
		System.out.println("setMaNguoiHoc");
		String maNguoiHoc = "";
		NguoiHoc instance = new NguoiHoc();
		instance.setMaNguoiHoc(maNguoiHoc);

	}

	/**
	 * Test of getHoVaTen method, of class NguoiHoc.
	 */
	@Test
	public void testGetHoVaTen() {
		System.out.println("getHoVaTen");
		NguoiHoc instance = new NguoiHoc();
		instance.setMaNguoiHoc("Nguyen van a");
		String expResult = "Nguyen van a";
		String result = instance.getHoVaTen();
		assertEquals(expResult, result);

	}

	/**
	 * Test of setHoVaTen method, of class NguoiHoc.
	 */
	@Test(expected = NullPointerException.class)
	public void testSetHoVaTenNull() {
		System.out.println("setHoVaTen");
		String hoVaTen = null;
		NguoiHoc instance = new NguoiHoc();
		instance.setHoVaTen(hoVaTen);

	}

	/**
	 * Test of getNgaySinh method, of class NguoiHoc.
	 */
	@Test
	public void testGetNgaySinh() {

		try {
			System.out.println("getNgayKhaiGiang");
			SimpleDateFormat sdf = new SimpleDateFormat();
			sdf.applyPattern("dd/MM/YYYY");
			NguoiHoc instance = new NguoiHoc();
			instance.setNgaySinh(sdf.parse("02/02/2002"));
			Date expResult = sdf.parse("02/02/2002");
			Date result = instance.getNgaySinh();
			assertEquals(expResult, result);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * Test of setNgaySinh method, of class NguoiHoc.
	 */
	@Test
	public void testSetNgaySinh() {
		try {
			System.out.println("getNgayKhaiGiang");
			SimpleDateFormat sdf = new SimpleDateFormat();
			sdf.applyPattern("dd/MM/YYYY");
			NguoiHoc instance = new NguoiHoc();
			instance.setNgaySinh(sdf.parse("02/02/2002"));
			Date expResult = sdf.parse("02/02/2002");
			Date result = instance.getNgaySinh();
			assertEquals(expResult, result);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test(expected = NullPointerException.class)
	public void testSetNgaySinhNull() {

		NguoiHoc instance = new NguoiHoc();
		instance.setNgaySinh(null);

	}

	/**
	 * Test of isGioiTinh method, of class NguoiHoc.
	 */
	@Test
	public void testIsGioiTinh() {
		System.out.println("isGioiTinh");
		NguoiHoc instance = new NguoiHoc();
		instance.setGioiTinh(false);
		boolean expResult = false;
		boolean result = instance.isGioiTinh();
		assertEquals(expResult, result);

	}

	/**
	 * Test of setGioiTinh method, of class NguoiHoc.
	 */
	@Test
	public void testSetGioiTinh() {
		System.out.println("setGioiTinh");
		boolean gioiTinh = false;
		NguoiHoc instance = new NguoiHoc();
		instance.setGioiTinh(gioiTinh);

	}

	/**
	 * Test of getSoDienThoai method, of class NguoiHoc.
	 */
	@Test
	public void testGetSoDienThoai() {
		System.out.println("getSoDienThoai");
		NguoiHoc instance = new NguoiHoc();
		instance.setSoDienThoai("090999009");
		String expResult = "090999009";
		String result = instance.getSoDienThoai();
		assertEquals(expResult, result);

	}

	/**
	 * Test of setSoDienThoai method, of class NguoiHoc.
	 */
	@Test
	public void testSetSoDienThoai() {
		System.out.println("getSoDienThoai");
		NguoiHoc instance = new NguoiHoc();
		instance.setSoDienThoai("090999009");
		String expResult = "090999009";
		String result = instance.getSoDienThoai();
		assertEquals(expResult, result);

	}

	@Test(expected = IllegalArgumentException.class)
	public void testSetSoDienThoaiNotNumber() {
		System.out.println("getSoDienThoai");
		NguoiHoc instance = new NguoiHoc();
		instance.setSoDienThoai("d2dac2x23");

	}

	/**
	 * Test of getEmail method, of class NguoiHoc.
	 */
	@Test
	public void testGetEmail() {
		System.out.println("getEmail");
		NguoiHoc instance = new NguoiHoc();
		instance.setEmail("vana@gmail.com");
		String expResult = "vana@gmail.com";
		String result = instance.getEmail();
		assertEquals(expResult, result);

	}

	/**
	 * Test of setEmail method, of class NguoiHoc.
	 */
	@Test
	public void testSetEmail() {
		System.out.println("getEmail");
		NguoiHoc instance = new NguoiHoc();
		instance.setEmail("vana@gmail.com");
		String expResult = "vana@gmail.com";
		String result = instance.getEmail();
		assertEquals(expResult, result);

	}

	@Test(expected = IllegalArgumentException.class)
	public void testSetEmailNotAt() {
		System.out.println("getEmail");
		NguoiHoc instance = new NguoiHoc();
		instance.setEmail("vanagmail.com");

	}

	/**
	 * Test of getGhiChu method, of class NguoiHoc.
	 */
	@Test
	public void testGetGhiChu() {
		System.out.println("getGhiChu");
		NguoiHoc instance = new NguoiHoc();
		String expResult = "";
		String result = instance.getGhiChu();
		assertEquals(expResult, result);

	}

	@Test
	public void testSetGhiChu() {
		System.out.println("setGhiChu");
		String ghiChu = "";
		NguoiHoc instance = new NguoiHoc();
		instance.setGhiChu(ghiChu);

	}

}
