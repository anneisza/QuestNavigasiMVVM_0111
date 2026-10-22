package com.example.praktikum5

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.praktikum5.view.FormIsian

enum class Navigasi {
    FormulirSaya,
    Detail
}

@Composable
fun DataApp(
    navController: NavController = rememberNavController()
){
    Scaffold{ isiRuang ->
        NavHost(
            navController = navController,
            startDestination = Navigasi.FormulirSaya.name,

            modifier = Modifier.padding(isiRuang)){
            composable(route = Navigasi.FormulirSaya.name){
                FormIsian(
                    //pilihanJK = Jenis
                    OnSubmitBtnClick = {
                        navController.navigate(Navigasi.Detail.name)
                    }
                ) { }
            }
        }
    }
}