from kivy.app import App 
from kivy.properties import ObjectProperty
from kivy.lang import Builder
from kivy.uix.screenmanager import ScreenManager, Screen
from kivy.graphics.texture import Texture
from kivy.clock import Clock
import cv2
import numpy as np
import pickle
from kivy.uix.camera import Camera
from kivy.uix.carousel import Carousel
import os
from kivy.uix.image import AsyncImage
import time
Start_time = time.time()
# Sets up and trains the face recognizer 
labels = {"person_name": 1}
with open("labels.pickle",'rb') as f:
    og_labels = pickle.load(f)
    labels = {v:k for k,v in og_labels.items()}
face_cascade = cv2.CascadeClassifier('cascades/data/haarcascade_frontalface_alt2.xml')
recognizer = cv2.face.LBPHFaceRecognizer_create()
recognizer.read("trainner.yml")
# Initializes the camera
cam = Camera(play = True, resolution = (600,600))

# Class for the main screen
class MainWindow(Screen):
    pass
# Class for the second screen which is the camera
class SecondWindow(Screen):
    # Method to add camera to the screen
    def SetupCam(self):
        self.cameraObject = cam
        self.add_widget(self.cameraObject)
    # Method to export the camera image and call anothe rmethod to perform face recognition on the image
    def TakePhoto(self):
        Start_time = time.time()
        self.cameraObject.export_to_png('temp.jpg')
        #img = Image.open('k.png')
        FaceRecognition.openCV(self)
        print("--- %s seconds ---" % (time.time() - Start_time))
    # Removes from the screen to avoid duplicate camera occurances 
    def RemoveCam(self):
        self.remove_widget(self.cameraObject)


# Class that instanciates the carousel
class MyCarousel(Carousel):
    dirs = "F:\Year 3\RaD Project\Project2\display"

    # Creates the carousel
    def __init__(self, **kwargs):
        super(MyCarousel, self).__init__(**kwargs)
        #self.carousel = Carousel(direction="right")
        self.direction = "right"
        dirs = "F:\Year 3\RaD Project\Project2\display"
        src = []
        for path in os.listdir(dirs):
            src.append(dirs + "\\" + path)
        for i in range(0, len(src)):
            srcs = src[i]
            image = AsyncImage(source=srcs, allow_stretch=True)
            self.add_widget(image)

# Class for the Gallery
class ImageDisplay(Screen):
    pass

# Class which manages the other screens
class WindowManager(ScreenManager):
    pass
# Class that performs face detection and recognition
class FaceRecognition:

    def openCV(self):
        img = cv2.imread('temp.jpg')

        gray = cv2.cvtColor(img, cv2.COLOR_BGR2GRAY)
        faces = face_cascade.detectMultiScale(gray, scaleFactor=1.1, minNeighbors=5)
        for (x, y, w, h) in faces:
            #print(x, y, w , h)
            roi_gray = gray[y:y+h, x:x+w]
            roi_color = img[y:y+h, x:x+w]
        # recognize

            id_, conf = recognizer.predict(roi_gray)
            if conf>= 57 and conf <=100:
                font = cv2.FONT_HERSHEY_SIMPLEX
                name = labels[id_]
                color = (255, 255, 255)
                stroke = 2
                cv2.putText(img, name, (x,y), font, 1, color, stroke, cv2.LINE_AA)
                print("Recognized" + name)
            else:
                img[y:y+h, x:x+w] = cv2.GaussianBlur(img[y:y+h, x:x+w],(15,15),cv2.BORDER_DEFAULT)
                print("Blurred")

        initial_count = 0
        dir = "F:\Year 3\RaD Project\Project2\display"
        for path in os.listdir(dir):
            if os.path.isfile(os.path.join(dir, path)):
              initial_count += 1

        img_item = str(initial_count) +".png"
        cv2.imwrite(os.path.join(dir, img_item), img)


# Main class that starts the program
class MyMainApp(App):
    # Builds the application from the kivy file
    def build(self):
        kv = Builder.load_file("my.kv")
        print("--- %s seconds ---" % (time.time() - Start_time))
        return kv    






# Runs the program in a protected state
if __name__ == "__main__":
    MyMainApp().run()
