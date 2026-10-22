package com.example.pertemuan6

import androidx.compose.material3.ModalWideNavigationRail
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.pertemuan6.view.FormIsian2

enum class Navigasi2 {
    FormulirSaya,
    Detail
}

@Composable
fun DataApp2(
    navController: NavController = rememberNavController()
){
    //variabel lokasl untuk menyimpan data sementara
    var  namaSiswa = ""
    var jkSiswa = ""
    var alamatSiswa = ""

    Scaffold { isiRuang->
        NavHost(
            navController = navController,
            startDestination = Navigasi2.FormulirSaya.name,
            modifier = Modifier.padding(paddingValues = isiRuang)
        ){
            composable(route = Navigasi2.FormulirSaya.name){
                FormIsian2(
                    OnSubmitBtnClick = { nama, jk, alamat ->
                        //simpan data ke variabel lokal sebelum pindah halaman
                        namaSiswa = nama
                        jkSiswa = jk
                        alamatSiswa = alamat

                        navController.navigate(route = Navigasi2.Detail.name)
                    }
                )
            }

        }
    }
}