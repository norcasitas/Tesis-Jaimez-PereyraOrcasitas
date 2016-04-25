Proyecto_eclipse contiene un proyecto desarrollado en eclipse que consiste en lo necesario para
llevar a cabo la transformación qvt y comparación de modelos requestModel y wsdl.
Dentro de la misma se encuentra:
	-Carpeta ecore_models: 
		Contiene los modelos ecore RequestModel y WSDL con su respectivos genmodel y diagrama.
		Para abrirlos, se debe tener el plugin "____" instalado.
	-Carpeta transforms:
		Contiene el archivo wsdlToRequest.qvto , este es un archivo de transformación qvto,
		que convierte un archivo wsdl con formato ecore en una requestModel.
	-Los demás archivos son propios del proyecto eclipse

Proyecto qvto contiene un proyecto QVTO, de la transformación M2M de wsdl a RequestModel.
Para correr este proyecto se debe tener el plugin "____" instalado, y configurar un archivo de configuración
desde el mismo IDE.

Proyecto QVTWSInvoker es un proyecto Maven, el cual contiene un programa con interface gráfica
para poder gestionar wsdl, categorías y realizar la invocación del mejor servicio web disponible.
Debe abrirse con netbeans o eclipse, y cargar la librería transformation1.0.0.jar ubicada en la carpeta lib
haciendo click en "dependencias", y poniendo "Instalar manualmente"
