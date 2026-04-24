// Clase base
class Personaje {
  atacar() {
    return "Ataque básico";
  }
}

// Decorator base
class Decorator {
  constructor(personaje) {
    this.personaje = personaje;
  }

  atacar() {
    return this.personaje.atacar();
  }
}

// Decoradores
class Fuerza extends Decorator {
  atacar() {
    return this.personaje.atacar() + " + golpe fuerte 💥";
  }
}

class Velocidad extends Decorator {
  atacar() {
    return this.personaje.atacar() + " + ataque rápido ⚡";
  }
}

class Defensa extends Decorator {
  atacar() {
    return this.personaje.atacar() + " + defensa 🛡️";
  }
}

// Uso
let personaje = new Personaje();

personaje = new Fuerza(personaje);
personaje = new Velocidad(personaje);

console.log(personaje.atacar());
