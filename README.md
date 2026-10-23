#### Relationship Between Classes

We have 3 relasionships:

- **Association: This is a weak relation, where the class have a relation 1-1.**
- **Agregation: This is also a weak realation, where the class usually have a list of the objects.**
- **Composition: This is a strong relation, where the objects belong to the class, and we create the objects in the contructor, if the class died the objects too.**

**Features added:**

- _Sub classes:_

  - Interviews and Podcats
  - Contrometraje
  - Corporativo

- _Resources:_

  - Actor
  - Researcher
  - Session

#### Testing:

We add e2e testing, with the intention to see the erros and also prove that we implement in a correct way the model logic.
I use

#### Instalation:

```bash

git clone https://github.com/4s3rn4m3/contenido_audiovisuales.git
cd  contenido_audiovisuales/src
java main/Main.java

```

#### **References:**

- [Unique id Secure](https://www.javathinking.com/blog/how-to-generate-unique-id-in-java-integer/#3-method-1-cryptographically-secure-random-integers-securerandom)
- [Abstract Class](https://www.ciberaula.com/cursos/java/clases_abstractas.php#que-son)
