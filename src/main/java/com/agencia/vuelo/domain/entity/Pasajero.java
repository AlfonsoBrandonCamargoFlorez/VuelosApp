package com.agencia.vuelo.domain.entity;

public class Pasajero {
int id;
String nombre;
int edad;
String tipoDocumento;
int idTipoDocumento;
String documento;
public Pasajero(int id, String nombre, int edad, String tipoDocumento, int idTipoDocumento, String documento) {
    this.id = id;
    this.nombre = nombre;
    this.edad = edad;
    this.tipoDocumento = tipoDocumento;
    this.idTipoDocumento = idTipoDocumento;
    this.documento = documento;
}
public int getId() {
    return id;
}
public void setId(int id) {
    this.id = id;
}
public String getNombre() {
    return nombre;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}
public int getEdad() {
    return edad;
}
public void setEdad(int edad) {
    this.edad = edad;
}
public String getTipoDocumento() {
    return tipoDocumento;
}
public void setTipoDocumento(String tipoDocumento) {
    this.tipoDocumento = tipoDocumento;
}
public int getIdTipoDocumento() {
    return idTipoDocumento;
}
public void setIdTipoDocumento(int idTipoDocumento) {
    this.idTipoDocumento = idTipoDocumento;
}
public String getDocumento() {
    return documento;
}
public void setDocumento(String documento) {
    this.documento = documento;
}
public Pasajero() {
}

}