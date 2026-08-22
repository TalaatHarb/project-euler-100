use std::time::Instant;

/// Trait for Project Euler solutions.
pub trait Solvable {
    /// Returns the problem name (e.g. "p001").
    fn problem_name(&self) -> &str;

    /// Solves the problem and returns the answer.
    fn solve(&self) -> i64;
}

/// Trait for running a solution with timing output.
pub trait Runable: Solvable {
    /// Runs the solution, printing the result and elapsed time.
    fn run(&self) {
        let start = Instant::now();
        let result = self.solve();
        let elapsed = start.elapsed().as_secs_f64();
        println!("{}: {} -> {} s", self.problem_name(), result, elapsed);
    }
}

/// Blanket implementation: every `Solvable` is automatically `Runable`.
impl<T: Solvable> Runable for T {}

pub mod solutions;
