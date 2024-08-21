/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package test.java.entity;

import entity.HocVien;
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
public class HocVienTest {
    
   
    @Test
    public void testGetMaHocVien() {
        System.out.println("getMaHocVien");
        HocVien instance = new HocVien();
        instance.setMaHocVien(1);
        int expResult = 1;
        int result = instance.getMaHocVien();
        assertEquals(expResult, result);
 
    }

    /**
     * Test of setMaHocVien method, of class HocVien.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSetMaHocVienNegative() {
        System.out.println("setMaHocVien");
        int maHocVien = -9;
        HocVien instance = new HocVien();
        instance.setMaHocVien(maHocVien);
    }
    @Test
    public void testSetMaHocVien() {
        System.out.println("setMaHocVien");
        int maHocVien = 2;
        HocVien instance = new HocVien();
        instance.setMaHocVien(maHocVien);
      
    }

    /**
     * Test of getMaKhoaHoc method, of class HocVien.
     */
    @Test
    public void testGetMaKhoaHoc() {
        System.out.println("getMaKhoaHoc");
        HocVien instance = new HocVien();
        instance.setMaKhoaHoc("khoahoc1");
        String expResult = "khoahoc1";
        String result = instance.getMaKhoaHoc();
        assertEquals(expResult, result);
    
    }

    /**
     * Test of setMaKhoaHoc method, of class HocVien.
     */
    @Test
    public void testSetMaKhoaHoc() {
        System.out.println("setMaKhoaHoc");
        String maKhoaHoc = "KhoaHoc1";
        HocVien instance = new HocVien();
        instance.setMaKhoaHoc(maKhoaHoc);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testSetMaKhoaHocAllNumber() {
        System.out.println("setMaKhoaHoc");
        String maKhoaHoc = "KhoaHoc1";
        HocVien instance = new HocVien();
        instance.setMaKhoaHoc(maKhoaHoc);
    }

    /**
     * Test of getMaNguoihoc method, of class HocVien.
     */
    @Test
    public void testGetMaNguoihoc() {
        System.out.println("getMaNguoihoc");
        HocVien instance = new HocVien();
        instance.setMaNguoihoc("NH23");
        String expResult = "NH23";
        String result = instance.getMaNguoihoc();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setMaNguoihoc method, of class HocVien.
     */
    @Test
    public void testSetMaNguoihoc() {
        System.out.println("setMaNguoihoc");
        String maNguoihoc = "23";
        HocVien instance = new HocVien();
        instance.setMaNguoihoc(maNguoihoc);
     
    }
    @Test(expected = IllegalArgumentException.class)
    public void testSetMaNguoihocNegative() {
        System.out.println("setMaNguoihoc");
        String maNguoihoc = "23";
        HocVien instance = new HocVien();
        instance.setMaNguoihoc(maNguoihoc);
     
    }

    /**
     * Test of getDiemTrungBinh method, of class HocVien.
     */
    @Test
    public void testGetDiemTrungBinh() {
        System.out.println("getDiemTrungBinh");
        HocVien instance = new HocVien();
        float expResult = -1.0F;
        float result = instance.getDiemTrungBinh();
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of setDiemTrungBinh method, of class HocVien.
     */
    @Test
    public void testSetDiemTrungBinhNegative() {
        System.out.println("setDiemTrungBinh");
        float diemTrungBinh = -10.0F;
        HocVien instance = new HocVien();
        instance.setDiemTrungBinh(diemTrungBinh);
        float expected = -1;
        assertEquals(expected, instance.getDiemTrungBinh(),0);
    }
    
}
