package com.example.kasirpos.ui.dashboard

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.kasirpos.R
import com.example.kasirpos.ui.login.LoginActivity
// Tambahkan import untuk activity lain nanti seperti ProdukActivity, dll

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val btnProduk: Button = findViewById(R.id.btnProduk)
        val btnTransaksi: Button = findViewById(R.id.btnTransaksi)
        val btnRiwayat: Button = findViewById(R.id.btnRiwayat)
        val btnLaporan: Button = findViewById(R.id.btnLaporan)
        val btnLogout: Button = findViewById(R.id.btnLogout)

        btnProduk.setOnClickListener {
            // TODO: Intent ke ProdukActivity
        }

        btnTransaksi.setOnClickListener {
            // TODO: Intent ke TransaksiActivity
        }

        btnRiwayat.setOnClickListener {
            // TODO: Intent ke RiwayatActivity
        }

        btnLaporan.setOnClickListener {
            // TODO: Intent ke LaporanActivity
        }

        btnLogout.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
