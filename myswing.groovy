import groovy.swing.*

def builder = new SwingBuilder()
def x = 0
def frame = builder.frame(title:"Hola mundo",size:[300,300]){
	flowLayout()
	label(text:"Etiqueta")
	t = textField(columns:10)
	button(text:"pushme!",actionPerformed:{
		x++
		t.text = x
	})
}

frame.show()