class Arma {

  int id;
  int forca;

  Arma(int id, int forca){
    this.id = id;
    this.forca = forca;
  }
  
  int retornaDanoDaArma(){
    return forca * 2;
  }
}