# Synchro App – E‑Commerce de relojes inteligentes

La aplicación simula un pequeño comercio electrónico de relojes inteligentes desarrollado en Android con Java y los componentes de Material Design.

## 📱 Descripción general

* **Pantalla de inicio de sesión:** se solicita un usuario y una contraseña. Cuando ambos campos contienen algún valor, se habilita el acceso a la tienda. También incorpora un checkbox “Recordar” y un texto “Olvidar contraseña” a modo ilustrativo.
* **Listado de productos:** tras iniciar sesión aparece un catálogo de seis smartwatches. Cada elemento se presenta en una tarjeta con la imagen del producto, su nombre y el precio. La pantalla es scrollable para ver todos los productos disponibles.
* **Detalle del producto:** al pulsar sobre cualquier tarjeta se navega a una vista detallada que muestra la foto ampliada, el nombre, una descripción breve y el precio. Esta pantalla ofrece un botón verde **COMPRAR** que simula la acción de compra: muestra un mensaje de éxito (Toast) y actualiza el contador de ítems en el ícono del carrito.

## 🧭 Navegación y flujo de la aplicación

1.  **Inicio de sesión:** Introduce cual quier texto en los campos Usuario y Contraseña y pulsa Iniciar Sesión.
2.  **Catálogo:** Aparecerá un encabezado con el mensaje «Bienvenido». Puedes desplazarte verticalmente para ver todas las opciones.
3.  **Detalle y Compra:** Toca una tarjeta para ver su descripción.
    * Al presionar **COMPRAR**, aparecerá un *Toast* verde indicando "Producto agregado" y el ícono del carrito mostrará un **badge rojo con la cantidad** de productos acumulados.
    * Puedes usar el botón **Volver** para regresar al catálogo y seleccionar otro reloj.


## 🛠️ Tecnologías y librerías utilizadas

- **Java 11** como lenguaje principal.
- **Android SDK 36** (minSdk 29).  Es necesario un dispositivo/emulador con Android 10 o superior.
- **Material Design Components** para los campos de entrada y botones.
- **ConstraintLayout**, **LinearLayout** y **ScrollView** para el diseño de las vistas.
- **CardView** para presentar cada producto.
- **Recursos XML**: las vistas se definen en `app/src/main/res/layout` y los textos en `strings.xml`.  Las imágenes de los relojes se encuentran en `app/src/main/res/drawable`.

## 🚀 Puesta en marcha

Para probar la aplicación en un entorno local se recomienda utilizar **Android Studio**:

1. Clona este repositorio o descarga los archivos como ZIP.
2. Abre Android Studio y selecciona **Open an existing project** indicando la carpeta del proyecto.
3. Espera a que el IDE resuelva las dependencias de Gradle.  El fichero `build.gradle.kts` ya declara todas las librerías necesarias.
4. Elige un dispositivo virtual (AVD) o conecta un dispositivo físico con Android 10+ y pulsa **Run** para compilar e instalar la aplicación.

No es necesario configurar una base de datos ni servicios externos; todos los datos de usuarios y productos están codificados localmente.

## 🧭 Navegación y flujo de la aplicación

1. **Inicio de sesión:** Introduce cualquier texto en los campos **Usuario** y **Contraseña** y pulsa **Iniciar Sesión**.  Si algún campo está vacío, no se realizará ninguna acción.
2. **Catálogo:** Aparecerá un encabezado con el mensaje «Bienvenido» seguido del nombre de usuario ingresado.  A continuación se muestran las tarjetas de productos.  Puedes desplazarte verticalmente para ver todas las opciones.
3. **Detalle:** Toca una tarjeta para ver su descripción.  Desde aquí puedes regresar con el botón **Volver**.  El botón **COMPRAR** está diseñado a modo decorativo y no lanza ningún flujo de pago.

## 📁 Estructura del proyecto

```
Parcial-2-am-ACN4BV-Rolon-Marecos-Ignacio/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/example/synchroapp/
│   │   │   │   ├── MainActivity.java      // Pantalla de inicio de sesión
│   │   │   │   ├── ResultActivity.java    // Muestra el catálogo de productos
│   │   │   │   └── CardProduct.java       // Presenta el detalle de un producto
│   │   │   └── res/
│   │   │       ├── layout/
│   │   │       │   ├── activity_main.xml      // Diseño de la pantalla de login
│   │   │       │   ├── activity_result.xml    // Diseño del catálogo
│   │   │       │   └── activity_card_product.xml // Diseño de la vista de detalle
│   │   │       ├── drawable/               // Imágenes y fondos
│   │   │       └── values/                 // strings.xml, colors.xml, themes
│   │   └── AndroidManifest.xml
│   └── build.gradle.kts
└── settings.gradle.kts
```


## Autor
**Ignacio Rolon Marecos**  
Proyecto desarrollado como parte de la plataforma Synchro.
