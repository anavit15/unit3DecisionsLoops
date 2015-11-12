import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;

/**
 * Game of Life starter code. Demonstrates how to create and populate the game using the GridWorld framework.
 * Also demonstrates how to provide accessor methods to make the class testable by unit tests.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class GameOfLife
{
    // the world comprised of the grid that displays the graphics for the game
    private ActorWorld world;
    
    // the game board will have 5 rows and 5 columns
    private final int ROWS = 6;
    private final int COLS = 6;
    
    /**
     * Default constructor for objects of class GameOfLife
     * 
     * @post    the game will be initialized and populated with the initial state of cells
     * 
     */
    public GameOfLife()
    {
        // create the grid, of the specified size, that contains Actors
        BoundedGrid<Actor> grid = new BoundedGrid<Actor>(ROWS, COLS);
        
        // create a world based on the grid
        world = new ActorWorld(grid);
        
        // populate the game
        populateGame();
        createNextGeneration();
        createNextGeneration();
        
        // display the newly constructed and populated world
        world.show();
        
    }
        
    
    
    /**
     * Creates the actors and inserts them into their initial starting positions in the grid
     *
     * @pre     the grid has been created
     * @post    all actors that comprise the initial state of the game have been added to the grid
     * 
     */
    private void populateGame()
    {
        // constants for the location of the three cells initially alive
        final int X1 = 1, Y1 = 1;
        final int X2 = 2, Y2 = 1;
        final int X3 = 4, Y3 = 1;
        final int X4 = 3, Y4 = 2;
        final int X5 = 4, Y5 = 2;
        final int X6 = 4, Y6 = 3;

        // the grid of Actors that maintains the state of the game
        //  (alive cells contains actors; dead cells do not)
        Grid<Actor> grid = world.getGrid();
        
        // create and add rocks (a type of Actor) to the three intial locations
        Rock rock1 = new Rock();
        Location loc1 = new Location(Y1, X1);
        grid.put(loc1, rock1);
        
        Rock rock2 = new Rock();
        Location loc2 = new Location(Y2, X2);
        grid.put(loc2, rock2);
        
        Rock rock3 = new Rock();
        Location loc3 = new Location(Y3, X3);
        grid.put(loc3, rock3);
        
        Rock rock4 = new Rock();
        Location loc4 = new Location(Y4, X4);
        grid.put(loc4, rock3);
        
        Rock rock5 = new Rock();
        Location loc5 = new Location(Y5, X5);
        grid.put(loc5, rock5);
        
        Rock rock6 = new Rock();
        Location loc6 = new Location(Y6, X6);
        grid.put(loc6, rock6);
        
        
        
    }
        
    

    /**
     * Generates the next generation based on the rules of the Game of Life and updates the grid
     * associated with the world
     *
     * @pre     the game has been initialized
     * @post    the world has been populated with a new grid containing the next generation
     * 
     */
    public void createNextGeneration()
    {
        /** You will need to read the documentation for the World, Grid, and Location classes
         *      in order to implement the Game of Life algorithm and leverage the GridWorld framework.
         */
        
        // create the grid, of the specified size, that contains Actors
        Grid<Actor> grid = world.getGrid();
        
        int totalSquares=ROWS*COLS;
        Location[] deadCells=new Location[totalSquares];
        Location[] newAliveCells=new Location[totalSquares];
        Location [] keptAliveCells=new Location[totalSquares];
        int deadCellArrayPlace=0;
        int newAliveCellArrayPlace=0;
        int keptAliveCellArrayPlace=0;
        
        for(int row = 0; row < ROWS; row++)
        {
            for (int col = 0; col < COLS; col++)
            {
              Location loc=new Location(row,col);
              if (getActor(row,col)==null)
              {
                  if (grid.getNeighbors(loc).size()!=2 || grid.getNeighbors(loc).size()!=3)
                  {
                      deadCells[deadCellArrayPlace]=loc;
                      deadCellArrayPlace++;
                     
                  }
                  else{
                      keptAliveCells[keptAliveCellArrayPlace]=loc;
                      keptAliveCellArrayPlace++;
             
                    }   
              }
             
              else{
                  if (grid.getNeighbors(loc).size()==3)
                  {
                      newAliveCells[newAliveCellArrayPlace]=loc;
                      newAliveCellArrayPlace++;
                    
                  }
              }   
            }
        }
        
        for (int i=0; i<deadCellArrayPlace;i++)
        {
            grid.remove(deadCells[i]);
        }
        
        for (int i=0; i<newAliveCellArrayPlace;i++)
        {
            Rock rock = new Rock();
            grid.put(newAliveCells[i],rock);
        }
        
        for (int i=0; i<keptAliveCellArrayPlace;i++)
        {
            Rock rock = new Rock();
            grid.put(keptAliveCells[i],rock);
        }
        
    }
    
    /**
     * Returns the actor at the specified row and column. Intended to be used for unit testing.
     *
     * @param   row the row (zero-based index) of the actor to return
     * @param   col the column (zero-based index) of the actor to return
     * @pre     the grid has been created
     * @return  the actor at the specified row and column
     */
     public Actor getActor(int row, int col)
        {
        Location loc = new Location(row, col);
        Actor actor = world.getGrid().get(loc);
        return actor;
        }

    /**
     * Returns the number of rows in the game board
     *
     * @return    the number of rows in the game board
     */
    public int getNumRows()
    {
        return ROWS;
    }
    
    /**
     * Returns the number of columns in the game board
     *
     * @return    the number of columns in the game board
     */
    public int getNumCols()
    {
        return COLS;
    }
    
    
    /**
     * Creates an instance of this class. Provides convenient execution.
     *
     */
    public static void main(String[] args)
    {
        GameOfLife game = new GameOfLife();
        
    }
}
