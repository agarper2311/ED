using UnityEngine;
using System.Collections;

public class ControladorDeLaCamara : MonoBehaviour {

    public GameObject jugador;
    private Vector3 posicionRelativa;

	// Use this for initialization
	void Start () {
        posicionRelativa = transform.position - jugador.transform.position;
	}
	
	// Update is called once per frame
	void Update () {
        transform.position = jugador.transform.position + posicionRelativa;
	}
}
