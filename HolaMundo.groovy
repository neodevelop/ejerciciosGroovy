class HolaMundo2{
  String nombre
  
  def saludo(){
    def x = 1 + 1
    "Hola $nombre !!!"
  }
  
}


def objeto = new HolaMundo2(nombre:"Felipe")
println objeto.saludo()
objeto.setNombre("Juan 6")
println objeto.saludo()
objeto["nombre"] = "SynergyJ"
println objeto.saludo()
objeto.nombre = "EBC"
println objeto.saludo()
println objeto.nombre