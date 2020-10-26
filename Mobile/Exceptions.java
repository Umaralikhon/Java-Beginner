package Platform;

//Исключение перехватывающий при вводе неправильных команд
class ScannerExceptions extends Exception {
    public ScannerExceptions(){
        System.out.println("Ошибка при вводе!");
    }
}

//Исключение перехватывающий при вводе неправильных показателей памяти
class StorageException extends Exception{

    StorageException(){
        System.out.println("Смартфон с такой памятью отсутствует!");
    }
}

//Исключение перехватывающий при вводе неправильных показателей камеры
class  CameraException extends Exception{
    public CameraException(){
        System.out.println("Такой камеры не существует!");
    }
}
