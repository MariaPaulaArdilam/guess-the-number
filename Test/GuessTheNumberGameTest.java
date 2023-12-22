import org.junit.jupiter.api.Test;


import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

class GuessTheNumberGameTest {

    @Test
    public void testRangeDifferenceFarWay() {
        // Arrange "donde se establecen los valores necesarios para realizar la prueba."
        int targetNumber = 50;
        int guessedNumber = 70;

        // Act "es donde se realiza la acción que se está probando"
        boolean guessed = GuessTheNumberGame.rangeDifference(targetNumber, guessedNumber, null, null);

        // Assert "es donde se verifica si el resultado de esa acción es el esperado"
        assertFalse(guessed, "El número adivinado es mayor, se esperaba un resultado falso.");
    }

    @Test
    public void testRangeDifferenceClose() {
        int targetNumber = 50;
        int guessedNumber = 55;

        boolean guessed = GuessTheNumberGame.rangeDifference(targetNumber, guessedNumber, null, null);

        assertFalse(guessed, "El número adivinado esta cercano, se esperaba un resultado falso.");
    }

    @Test
    public void testRangeDifferenceAttempts() {
        int targetNumber = 50;
        int guessedNumber = 50;

        boolean guessed = GuessTheNumberGame.rangeDifference(targetNumber, guessedNumber, null, null);

        assertTrue(guessed, "El número adivinado es correcto, se esperaba un resultado true.");
    }

   @Test
    public void testCheckGuess() {
        HumanPlayer humanPlayerMock = mock(HumanPlayer.class);
        ComputerPlayer computerPlayerMock = mock(ComputerPlayer.class);

        int targetNumber = 50;

        // Configurar el comportamiento esperado de los métodos makeGuess() en los mocks
        when(humanPlayerMock.getName()).thenReturn("Hugo");
        when(humanPlayerMock.makeGuess(any())).thenReturn(20, 52,30, 50);
        when(computerPlayerMock.makeGuess(any())).thenReturn(55);

        // Ejecutar el método checkGuess() con los mocks
        GuessTheNumberGame.checkGuess(humanPlayerMock, computerPlayerMock, targetNumber);

        // Verificar interacciones esperadas
        verify(humanPlayerMock, atLeastOnce()).makeGuess(any());
        verify(computerPlayerMock, atLeastOnce()).makeGuess(any());
    }

}
