import sys
from PyQt5 import uic
from PyQt5.QtWidgets import QApplication, QMainWindow

form_class = uic.loadUiType("myqt04.ui")[0]


class MainClass(QMainWindow, form_class):
    def __init__(self) :
        QMainWindow.__init__(self)
        self.setupUi(self)
        
        self.pb.clicked.connect(self.myclick)
        self.show()
        
    def myclick(self):   
        dan = self.le.text()
        idan = int(dan)
        
        txt = ""
        txt += "{}*{}={}\n".format(idan,1,idan*1)
        txt += "{}*{}={}\n".format(idan,2,idan*2)
        txt += "{}*{}={}\n".format(idan,3,idan*3)
        txt += "{}*{}={}\n".format(idan,4,idan*4)
        txt += "{}*{}={}\n".format(idan,5,idan*5)
        txt += "{}*{}={}\n".format(idan,6,idan*6)
        txt += "{}*{}={}\n".format(idan,7,idan*7)
        txt += "{}*{}={}\n".format(idan,8,idan*8)
        txt += "{}*{}={}\n".format(idan,9,idan*9)
        
        self.te.setText(txt)
        
if __name__ == "__main__" :
    app = QApplication(sys.argv) 
    window = MainClass() 
    app.exec_()
    
    