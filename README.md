
# Raylib-Jona Project Setup

Este proyecto utiliza **Raylib-Jona**, una integración con LWJGL para gráficos en Java. Este README provee todas las instrucciones necesarias para configurar y ejecutar el proyecto en un entorno Windows de 64 bits.

## Configuración Inicial

1. Clona el proyecto en tu máquina local y asegúrate de tener la siguiente estructura de carpetas en tu sistema:

   ```
   C:\github\Raylib-Jona\target\lib
   ```

2. Registra en tu repositorio Maven local (`.m2`) las siguientes librerías necesarias para el proyecto:

   - **gltf-j-1.0.jar**
   - **voxfileparser-0.3.jar**

## Comandos para Registrar Librerías en el Repositorio Local de Maven

Para instalar cada librería en el repositorio Maven local (`.m2`), ejecuta los siguientes comandos en la terminal.

### Instalación de `gltf-j-1.0.jar`

```bash
mvn install:install-file -Dfile=C:\github\Raylib-Jona\target\lib\gltf-j.jar -DgroupId=com.jofrantoba -DartifactId=gltf-j -Dversion=1.0 -Dpackaging=jar
```

### Instalación de `VoxFileParser-0.3.jar`

```bash
mvn install:install-file -Dfile=C:\github\Raylib-Jona\target\lib\VoxFileParser-0.3.jar -DgroupId=com.jofrantoba -DartifactId=voxfileparser -Dversion=0.3 -Dpackaging=jar
```

## Abrir el Proyecto en NetBeans

1. Abre NetBeans y carga el proyecto desde la ruta:

   ```
   C:\github\Raylib-Jona
   ```

2. Usa la acción personalizada `clean build Win64` para construir el proyecto. Esto asegurará que el perfil `windows-x64` esté activado y las librerías nativas correspondientes se utilicen.

### Configuración de la Acción Personalizada `clean build Win64`

Para añadir esta acción personalizada, edita el archivo `nbactions.xml` y agrega el siguiente bloque. Este bloque realizará una limpieza y construcción del proyecto utilizando el perfil `windows-x64`:

```xml
<action>
    <actionName>CUSTOM-clean build Win64</actionName>
    <displayName>clean build Win64</displayName>
    <goals>
        <goal>clean</goal>
        <goal>install</goal>
        <goal>-Pwindows-x64</goal>
    </goals>
</action>
```

Este bloque de acción personalizada permite compilar y construir el proyecto con las dependencias nativas correctas para un sistema operativo de 64 bits en Windows.

## Ejecución del Proyecto

Con las configuraciones anteriores, el proyecto está listo para compilarse y ejecutarse en el perfil de `windows-x64`. Este perfil asegura que las librerías nativas de LWJGL se copien a `target/natives` y estén disponibles para su uso durante la ejecución del proyecto. ¡Disfruta desarrollando!
