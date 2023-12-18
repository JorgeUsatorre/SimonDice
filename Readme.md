# Simon Dice con estructura MVVC
Este proyecto de Simon Dice está implementado utilizando el patrón de arquitectura MVVM (Model-View-ViewModel).

## Estructura del Proyecto

El proyecto está organizado en varios paquetes para mejorar la modularidad y la claridad del código:

- Model: Contiene la clase SimonViewModel, que actúa como el ViewModel para la lógica de la aplicación.

- ui.theme: Contiene las funciones relacionadas con la interfaz de usuario (UI). Estas funciones reciben el ViewModel como parámetro.

- MainActivity: La actividad principal que configura y muestra la interfaz de usuario. Aquí se instancia el ViewModel.

