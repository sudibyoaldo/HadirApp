package com.juaracoding.utils;

public enum ScenarioTests {

    TCC_Hadir_02_024("Invalid Import File Absen Hadir Scenario without File"),
    TCC_Hadir_02_025("Invalid Import File Absen Hadir Scenario with OtherThanTemplate.xlsx"),
    TCC_Hadir_02_026("Invalid Import File Absen Hadir Scenario with InvalidHeader.xlsx"),
    TCC_Hadir_02_027("Invalid Import File Absen Hadir Scenario with InvalidNIK.xlsx"),
    TCC_Hadir_02_028("Invalid Import File Absen Hadir Scenario with InvalidName.xlsx"),
    TCC_Hadir_02_029("Invalid Import File Absen Hadir Scenario with FutureDate.xlsx"),
    TCC_Hadir_02_030("Invalid Import File Absen Hadir Scenario with InvalidFormatDate.xlsx"),
    TCC_Hadir_02_031("Invalid Import File Absen Hadir Scenario with ClockInMoreThanClockOut"),
    TCC_Hadir_02_032("Invalid Import File Absen Hadir Scenario with Dummy.pdf"),
    TCC_Hadir_02_033("Download Template Absen Hadir Scenario"),
    TCC_Hadir_02_034("Valid Import File Absen Hadir Scenario"),
    TCC_Hadir_02_054("Add new Aturan Cuti with Valid Data"),
    TCC_Hadir_02_055("Search Aturan Cuti"),
    TCC_Hadir_02_056("Show 5 Data Aturan Cuti per Page and Check Next Page Button"),
    TCC_Hadir_02_057("Check Reset Button"),
    TCC_Hadir_02_058("Check Close Button on Tambahkan Aturan Cuti Page"),
    TCC_Hadir_02_059("Edit Aturan Cuti November"),
    TCC_Hadir_02_060("View and Add Detail Aturan Cuti Desember"),
    TCC_Hadir_02_061("Edit Detail Aturan Cuti Desember"),
    TCC_Hadir_02_062("Delete Detail Aturan Cuti Desember"),
    TCC_Hadir_02_063("Invalid Aturan Cuti Scenario with empty Aturan Cuti Name"),
    TCC_Hadir_02_064("Invalid Aturan Cuti Scenario with empty Tanggal Batas Sisa Cuti"),
    TCC_Hadir_02_065("Invalid Aturan Cuti Scenario with empty Bulan Batas Sisa Cuti"),
    TCC_Hadir_02_066("Invalid Aturan Cuti Scenario with Eligible Pengaturan Cuti Bulan less than 0"),
    TCC_Hadir_02_067("Invalid Aturan Cuti Scenario with Maksimal Sisa Cuti less than 0"),
    TCC_Hadir_02_068("Invalid Aturan Cuti Scenario with Jumlah Bulan Kerja Sisa Cuti less than 0"),
    TCC_Hadir_02_069("Invalid Aturan Cuti Scenario with Aturan Cuti Name more than 255 characters"),
    TCC_Hadir_02_070("Invalid Aturan Cuti Scenario with redundant Aturan Cuti Name"),
    TCC_Hadir_02_071("Invalid Detail Aturan Cuti Desember with Minimal Bulan Bekerja less than 0"),
    TCC_Hadir_02_072("Invalid Detail Aturan Cuti Desember with Total Cuti less than 0"),
    TCC_Hadir_02_073("Invalid Detail Aturan Cuti Desember with empty Minimal Bulan Bekejra"),
    TCC_Hadir_02_074("Invalid Detail Aturan Cuti Desember with empty Total Cuti"),
    TCC_Hadir_02_075("Delete Aturan Cuti Desember");
    private String scenarioTestName;

    ScenarioTests(String value){
        scenarioTestName = value;
    }

    public String getScenarioTestName(){
        return scenarioTestName;
    }

}
