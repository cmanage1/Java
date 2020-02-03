/**
 * An enum class that defines the
 * values <b>EMPTY</b>,  <b>X</b>
 * and <b>O</b>.
 *
 * @author Guy-Vincent Jourdan, University of Ottawa
 */

enum CellValue {
    EMPTY{
        public String toString(){
            return " ";
        }
    },
    X,
    O;
}
