Este programa está diseñado para modelar un sistema de gestión de bibliografía y producción científica aplicando los pilares fundamentales de la programación orientada a objetos en Java: herencia, encapsulamiento, reutilización mediante la palabra clave super y polimorfismo a través de la sobrescritura de métodos (@Override) para la generación automática de referencias bibliográficas en formatos estándar (como APA e IEEE).

A continuación se detalla exactamente lo que hace cada parte del programa:

Define la clase base PublicacionAcademica: Concentra los atributos comunes a cualquier trabajo de investigación (titulo, fechaPublicacion y una lista de autores), provee un constructor centralizado y define métodos de validación de indexación y formato base.

Desarrollar las clases hijas (ArticuloIndexado, ActaCongreso y TesisDoctoral): Extienden de PublicacionAcademica incorporando sus atributos particulares y especializados (factor de impacto y cuartil para el artículo de revista; nombre del simposio y ciudad sede para las actas de congreso; director de tesis y universidad otorgante para la tesis doctoral).

Sobrescribe el método de citación bibliográfica: Cada subclase implementa su propia regla de formateo textual para exportar la referencia en estilo APA o IEEE de manera polimórfica.

Ejecuta la prueba en el main: Crea una lista polimórfica de publicaciones académicas de distinta naturaleza, invoca la generación de referencias bibliográficas formateadas y muestra los resultados por consola.
