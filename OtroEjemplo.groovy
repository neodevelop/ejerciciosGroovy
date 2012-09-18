hoy = new Date()
ayer = hoy - 1
maniana = hoy + 1
antier = ayer - 1
(antier..maniana).each{
	println it
}
(1..10).each{
	println it
}

def lista = []
println lista.class.name
lista.add(3)
lista << 4 << 7
lista = lista + [ 6,8,0 ]
println lista

def mapa = [:]
println mapa.getClass().getName()
mapa.put("X",43)
mapa.Y = 65
println mapa
println mapa.X