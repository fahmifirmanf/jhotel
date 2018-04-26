package jhotel.controller;
import jhotel.*;
import org.springframework.web.bind.annotation.*;



public class PesananController {
    @RequestMapping("/pesanancustomer/{id_customer}")
    public Pesanan pesananCust(@PathVariable int id_customer) {
        Pesanan pesanan = DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(id_customer));
        return pesanan;
    }

    @RequestMapping("/pesanan/{id_pesanan}")
    public Pesanan getPesanan(@PathVariable int id_pesanan) {
        Pesanan pesanan = DatabasePesanan.getPesanan(id_pesanan);
        return pesanan;
    }

    @RequestMapping(value = "/buatpesanan", method = RequestMethod.POST)
    public Pesanan loginCust(@PathVariable double jumlah_hari, int id_customer, int id_hotel, String nomor_kamar) {
        Pesanan buatpesanan = DatabasePesanan.getPesanan(id_customer);
        return buatpesanan;
    }


}
