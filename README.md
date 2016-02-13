La carpeta model contiene el .ecore del metamodelo WSDL con su respectivo genmodel y diagrama, 
con el genmodel se autogenera la carpeta org.eclipse.wst.wsdl la cual contiene código java para 
la representación de un archivo .wsdl en un formato ecore, para luego poder exportarlo a .xmi
y generar las transformaciones necesarias.

la carpeta org.eclipse.wst.wsdl es un proyecto Eclipse, en su main se encuentra una demostración
de como sería un parseo dado un archivo .wsdl o url del mismo a la representación en un modelo .ecore.
